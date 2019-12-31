package cn.tcc.workflow.contract.dto.task;

import java.util.List;

public class TaskType {
    private String id;

    private String url;

    private String owner;

    private String assignee;

    private String delegationState;

    private String name;

    private String description;

    private String createTime;

    private String dueDate;

    private int priority;

    private boolean suspended;

    private String taskDefinitionKey;

    private String tenantId;

    private String category;

    private String formKey;

    private String parentTaskId;

    private String parentTaskUrl;

    private String executionId;

    private String executionUrl;

    private String processInstanceId;

    private String processInstanceUrl;

    private String processDefinitionId;

    private String processDefinitionUrl;

    private List<String> variables;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return this.owner;
    }
    public void setAssignee(String assignee){
        this.assignee = assignee;
    }
    public String getAssignee(){
        return this.assignee;
    }
    public void setDelegationState(String delegationState){
        this.delegationState = delegationState;
    }
    public String getDelegationState(){
        return this.delegationState;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setCreateTime(String createTime){
        this.createTime = createTime;
    }
    public String getCreateTime(){
        return this.createTime;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public String getDueDate(){
        return this.dueDate;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
    public int getPriority(){
        return this.priority;
    }
    public void setSuspended(boolean suspended){
        this.suspended = suspended;
    }
    public boolean getSuspended(){
        return this.suspended;
    }
    public void setTaskDefinitionKey(String taskDefinitionKey){
        this.taskDefinitionKey = taskDefinitionKey;
    }
    public String getTaskDefinitionKey(){
        return this.taskDefinitionKey;
    }
    public void setTenantId(String tenantId){
        this.tenantId = tenantId;
    }
    public String getTenantId(){
        return this.tenantId;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }
    public void setFormKey(String formKey){
        this.formKey = formKey;
    }
    public String getFormKey(){
        return this.formKey;
    }
    public void setParentTaskId(String parentTaskId){
        this.parentTaskId = parentTaskId;
    }
    public String getParentTaskId(){
        return this.parentTaskId;
    }
    public void setParentTaskUrl(String parentTaskUrl){
        this.parentTaskUrl = parentTaskUrl;
    }
    public String getParentTaskUrl(){
        return this.parentTaskUrl;
    }
    public void setExecutionId(String executionId){
        this.executionId = executionId;
    }
    public String getExecutionId(){
        return this.executionId;
    }
    public void setExecutionUrl(String executionUrl){
        this.executionUrl = executionUrl;
    }
    public String getExecutionUrl(){
        return this.executionUrl;
    }
    public void setProcessInstanceId(String processInstanceId){
        this.processInstanceId = processInstanceId;
    }
    public String getProcessInstanceId(){
        return this.processInstanceId;
    }
    public void setProcessInstanceUrl(String processInstanceUrl){
        this.processInstanceUrl = processInstanceUrl;
    }
    public String getProcessInstanceUrl(){
        return this.processInstanceUrl;
    }
    public void setProcessDefinitionId(String processDefinitionId){
        this.processDefinitionId = processDefinitionId;
    }
    public String getProcessDefinitionId(){
        return this.processDefinitionId;
    }
    public void setProcessDefinitionUrl(String processDefinitionUrl){
        this.processDefinitionUrl = processDefinitionUrl;
    }
    public String getProcessDefinitionUrl(){
        return this.processDefinitionUrl;
    }
    public void setVariables(List<String> variables){
        this.variables = variables;
    }
    public List<String> getVariables(){
        return this.variables;
    }
}
