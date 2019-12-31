package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.HttpMethodType;

@ClientRequestAttribute( httpMethod = HttpMethodType.DELETE, path = "/workflow/identity/groups/{groupId}/members/{userId}")
public class DeleteMemberRequest extends WfRequest {

}
