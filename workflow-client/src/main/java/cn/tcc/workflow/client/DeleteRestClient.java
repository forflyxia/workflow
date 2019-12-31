package cn.tcc.workflow.client;

import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.WfResponse;
import org.apache.cxf.jaxrs.client.WebClient;
import javax.ws.rs.core.Response;

public class DeleteRestClient<TRequest extends WfRequest, TResponse extends WfResponse> extends RestClient<TRequest, TResponse> {

    @Override
    public TResponse call(TRequest request, Class<TResponse> responseClass) {
        WebClient client = getClient(request);
        Response response = client.delete();
        return null;
    }
}
