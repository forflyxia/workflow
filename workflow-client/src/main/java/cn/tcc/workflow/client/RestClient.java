package cn.tcc.workflow.client;

import cn.tcc.workflow.ClientConfig;
import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.WfResponse;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.KeyValueType;
import org.apache.cxf.jaxrs.client.WebClient;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;


public abstract class RestClient<TRequest extends WfRequest, TResponse extends WfResponse> {

    protected WebClient getClient(TRequest request) {
        String url = getUri(request);
        WebClient client = WebClient.create(url);
        client.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
        return client;
    }

    private String getUri(TRequest request) {
        WfRequest baseRequest = (WfRequest)request;
        String path = getPath(request);
        if (baseRequest.getPathVariables() != null) {
            for (KeyValueType variable : baseRequest.getPathVariables()) {
                path = path.replace(String.format("{%s}", variable.getKey()), variable.getValue());
            }
            while (path.contains("{") && path.contains("}")){
                path = path.substring(0,path.lastIndexOf("{")-1)+path.substring(path.lastIndexOf("}")+1);
            }
            if(path.endsWith("/")){
                path = path.substring(0,path.lastIndexOf("/")-1);
            }
        }
        if(baseRequest.getQueryVariables() != null){
            path+="?1=1";
            for (KeyValueType variable : baseRequest.getQueryVariables()) {
                path += String.format("&%s=%s", variable.getKey(), variable.getValue());
            }
        }
        return ClientConfig.getHostAddressValue() + path;
    }

    private String getPath(TRequest request) {

        ClientRequestAttribute attribute = request.getClass().getAnnotation(ClientRequestAttribute.class);
        if (attribute != null) {
            return attribute.path();
        }
        return "";
    }

    public abstract TResponse call(TRequest request, Class<TResponse> responseClass);
}
