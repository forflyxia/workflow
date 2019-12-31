package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.HttpMethodType;
import cn.tcc.workflow.contract.dto.common.KeyValueType;
import cn.tcc.workflow.contract.dto.common.VariableType;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@ClientRequestAttribute( httpMethod = HttpMethodType.POST, path = "/workflow/runtime/tasks/{taskId}")
public class ExecuteTaskRequest extends WfRequest {

    private String action;
    private String assignee;
    private List<VariableType> variables;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public List<VariableType> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableType> variables) {
        this.variables = variables;
    }
}
