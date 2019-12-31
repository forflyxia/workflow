package cn.tcc.workflow.client;

import cn.tcc.foundation.core.serialization.FastJsonSerializer;
import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.WfResponse;
import org.apache.cxf.jaxrs.client.WebClient;
import javax.ws.rs.core.Response;

public class PostRestClient<TRequest extends WfRequest, TResponse extends WfResponse> extends RestClient<TRequest, TResponse> {

    @Override
    public TResponse call(TRequest request, Class<TResponse> responseClass) {
        WebClient client = getClient(request);
        String requestJson = FastJsonSerializer.toString(request);
        Response res = client.post(requestJson);
        String json =  res.readEntity(String.class);
        return (TResponse)FastJsonSerializer.toObject(json, responseClass);
    }
}
