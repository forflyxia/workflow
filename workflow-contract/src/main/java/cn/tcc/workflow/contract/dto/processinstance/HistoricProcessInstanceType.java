package cn.tcc.workflow.contract.dto.processinstance;

import java.util.Date;
import java.util.List;

public class HistoricProcessInstanceType {
    private String id;
    private String url;
    private String businessKey;
    private String processDefinitionId;
    private String processDefinitionUrl;
    private Date startTime;
    private Date endTime;
    private long durationInMillis;
    private String startUserId;
    private String startActivityId;
    private String endActivityId;
    private String deleteReason;
    private String superProcessInstanceId;
    private List<String> variables;
    private String tenantId;
    private String name;
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

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public Date getEndTime() {
        return endTime;
    }

    public void setDurationInMillis(long durationInMillis) {
        this.durationInMillis = durationInMillis;
    }
    public long getDurationInMillis() {
        return durationInMillis;
    }

    public void setStartUserId(String startUserId) {
        this.startUserId = startUserId;
    }
    public String getStartUserId() {
        return startUserId;
    }

    public void setStartActivityId(String startActivityId) {
        this.startActivityId = startActivityId;
    }
    public String getStartActivityId() {
        return startActivityId;
    }

    public void setEndActivityId(String endActivityId) {
        this.endActivityId = endActivityId;
    }
    public String getEndActivityId() {
        return endActivityId;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }
    public String getDeleteReason() {
        return deleteReason;
    }

    public void setSuperProcessInstanceId(String superProcessInstanceId) {
        this.superProcessInstanceId = superProcessInstanceId;
    }
    public String getSuperProcessInstanceId() {
        return superProcessInstanceId;
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
}
