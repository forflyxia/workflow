package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.HttpMethodType;
import cn.tcc.workflow.contract.dto.common.KeyValueType;

import java.util.List;

@ClientRequestAttribute( httpMethod = HttpMethodType.DELETE, path = "/workflow/runtime/process-instances/{processInstanceId}")
public class DeleteProcessRequest extends WfRequest {

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    private String deleteReason;

}
