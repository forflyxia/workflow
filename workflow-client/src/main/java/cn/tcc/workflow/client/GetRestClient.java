package cn.tcc.workflow.client;

import cn.tcc.foundation.core.serialization.FastJsonSerializer;
import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.WfResponse;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GetRestClient<TRequest extends WfRequest, TResponse extends WfResponse> extends RestClient<TRequest, TResponse> {

    private static final HashMap<String, Method> METHOD_HASH_MAP = new HashMap<String, Method>();

    @Override
    public TResponse call(TRequest request, Class<TResponse> responseClass) {
        WebClient client = getClient(request);
        Map<String, String> queryStringMap = getFieldMap(request);
        for (Map.Entry<String, String> entry : queryStringMap.entrySet()) {
            client.query(entry.getKey(), entry.getValue());
        }
        Response res = client.get();
        if(res.getStatusInfo().getStatusCode()==Response.Status.NOT_FOUND.getStatusCode()){
            return null;
        }
        String json = res.readEntity(String.class);
        return FastJsonSerializer.toObject(json, responseClass);
    }

    private Map<String, String> getFieldMap(Object requestBody) {
        final Class clazz = requestBody.getClass();
        Field[] fields = clazz.getDeclaredFields();

        Map<String, String> queryStringMap = new HashMap<String, String>();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                String firstLetter = field.getName().substring(0, 1);
                final String getterName = "get" + field.getName().replaceFirst(firstLetter, firstLetter.toUpperCase());
                String hashKey = String.format("%s_%s", clazz.getName(), field.getName());
                Method m = METHOD_HASH_MAP.computeIfAbsent(hashKey, key -> getMethod(clazz, getterName));
                if (m != null) {
                    Object value = m.invoke(requestBody);
                    if (value != null) {
                        queryStringMap.put(field.getName(), value.toString());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return queryStringMap;
    }

    private Method getMethod(Class<?> clazz, String methodName) {
        Method m = null;
        try {
            m = clazz.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return m;
    }
}
