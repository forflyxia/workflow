package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.HttpMethodType;
import cn.tcc.workflow.contract.dto.common.KeyValueType;
import java.util.List;

@ClientRequestAttribute( httpMethod = HttpMethodType.POST, path = "/workflow/runtime/process-instances")
public class StartProcessRequest extends WfRequest {

    private String processDefinitionKey;
    private String businessKey;
    private String userId;
    private List<KeyValueType> variables;

    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<KeyValueType> getVariables() {
        return variables;
    }

    public void setVariables(List<KeyValueType> variables) {
        this.variables = variables;
    }



}
