package cn.tcc.workflow.contract.dto.processinstance;

import java.util.Date;
import java.util.List;

public class ProcessInstanceType {

    private String id;
    private String url;
    private String businessKey;
    private boolean suspended;
    private boolean ended;
    private String processDefinitionId;
    private String processDefinitionUrl;
    private String processDefinitionKey;
    private String activityId;
    private List<String> variables;
    private String tenantId;
    private String name;
    private boolean completed;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }
    public String getBusinessKey() {
        return businessKey;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
    public boolean getSuspended() {
        return suspended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }
    public boolean getEnded() {
        return ended;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionUrl(String processDefinitionUrl) {
        this.processDefinitionUrl = processDefinitionUrl;
    }
    public String getProcessDefinitionUrl() {
        return processDefinitionUrl;
    }

    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }
    public String getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    public String getActivityId() {
        return activityId;
    }

    public void setVariables(List<String> variables) {
        this.variables = variables;
    }
    public List<String> getVariables() {
        return variables;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public boolean getCompleted() {
        return completed;
    }
}
