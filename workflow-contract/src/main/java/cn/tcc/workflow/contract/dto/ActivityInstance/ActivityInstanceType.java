package cn.tcc.workflow.contract.dto.ActivityInstance;

import java.util.Date;

public class ActivityInstanceType {
    private String id;
    private String activityId;
    private String activityName;
    private String activityType;
    private String processDefinitionId;
    private String processDefinitionUrl;
    private String processInstanceId;
    private String processInstanceUrl;
    private String executionId;
    private String taskId;
    private String calledProcessInstanceId;
    private String assignee;
    private Date startTime;
    private Date endTime;
    private int durationInMillis;
    private String tenantId;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    public String getActivityId() {
        return activityId;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    public String getActivityName() {
        return activityName;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }
    public String getActivityType() {
        return activityType;
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

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceUrl(String processInstanceUrl) {
        this.processInstanceUrl = processInstanceUrl;
    }
    public String getProcessInstanceUrl() {
        return processInstanceUrl;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }
    public String getExecutionId() {
        return executionId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    public String getTaskId() {
        return taskId;
    }

    public void setCalledProcessInstanceId(String calledProcessInstanceId) {
        this.calledProcessInstanceId = calledProcessInstanceId;
    }
    public String getCalledProcessInstanceId() {
        return calledProcessInstanceId;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
    public String getAssignee() {
        return assignee;
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

    public void setDurationInMillis(int durationInMillis) {
        this.durationInMillis = durationInMillis;
    }
    public int getDurationInMillis() {
        return durationInMillis;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getTenantId() {
        return tenantId;
    }
}
