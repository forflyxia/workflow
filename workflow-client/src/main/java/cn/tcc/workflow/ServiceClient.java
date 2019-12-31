package cn.tcc.workflow;

import cn.tcc.workflow.client.DeleteRestClient;
import cn.tcc.workflow.client.GetRestClient;
import cn.tcc.workflow.client.PostRestClient;
import cn.tcc.workflow.client.RestClient;
import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.WfResponse;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.HttpMethodType;

public   class  ServiceClient {
    public static <TRequest extends WfRequest, TResponse extends WfResponse> TResponse call(TRequest request, Class<TResponse> responseClass) {
        HttpMethodType httpMethod = getHttpMethod(request);
        RestClient<TRequest, TResponse> client = createClient(httpMethod);
        return client.call(request, responseClass);
    }

    public static String getHostAddress(){
        return ClientConfig.getHostAddressValue();
    }

    private static <TRequest extends WfRequest> HttpMethodType getHttpMethod(TRequest request) {
        ClientRequestAttribute attribute = request.getClass().getAnnotation(ClientRequestAttribute.class);
        if (attribute != null) {
            return attribute.httpMethod();
        }
        return null;
    }

    private static <TRequest extends WfRequest, TResponse extends WfResponse> RestClient<TRequest, TResponse> createClient(HttpMethodType httpMethod){

        switch (httpMethod) {
            case GET: {
                return new GetRestClient<>();
            }
            case POST: {
                return new PostRestClient<>();
            }
            case DELETE: {
                return new DeleteRestClient<>();
            }
        }
        return null;
    }
}
