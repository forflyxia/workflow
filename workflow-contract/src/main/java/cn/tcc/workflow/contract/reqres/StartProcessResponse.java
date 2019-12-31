package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfResponse;
import cn.tcc.workflow.contract.dto.common.VariableType;

import java.util.List;

public class StartProcessResponse extends WfResponse {

    private String activityId;
    private String businessKey;
    private boolean completed;
    private boolean ended;
    private String id;
    private String name;
    private String processDefinitionId;
    private String processDefinitionKey;
    private String processDefinitionUrl;
    private boolean suspended;
    private String tenantId;
    private String url;
    private List<VariableType> variables;
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    public String getActivityId() {
        return activityId;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }
    public String getBusinessKey() {
        return businessKey;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public boolean getCompleted() {
        return completed;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }
    public boolean getEnded() {
        return ended;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }
    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionUrl(String processDefinitionUrl) {
        this.processDefinitionUrl = processDefinitionUrl;
    }
    public String getProcessDefinitionUrl() {
        return processDefinitionUrl;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
    public boolean getSuspended() {
        return suspended;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void setVariables(List<VariableType> variables) {
        this.variables = variables;
    }
    public List<VariableType> getVariables() {
        return variables;
    }
}
