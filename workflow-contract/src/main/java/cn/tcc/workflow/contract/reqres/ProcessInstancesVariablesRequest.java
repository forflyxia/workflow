package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.HttpMethodType;

@ClientRequestAttribute( httpMethod = HttpMethodType.GET, path = "/workflow/runtime/process-instances/{processInstanceId}/variables")
public class ProcessInstancesVariablesRequest extends WfRequest {

}
