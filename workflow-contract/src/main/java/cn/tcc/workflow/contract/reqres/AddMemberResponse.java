package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfResponse;

public class AddMemberResponse extends WfResponse {
    private String groupId;

    private String url;

    private String userId;

    public void setGroupId(String groupId){
        this.groupId = groupId;
    }
    public String getGroupId(){
        return this.groupId;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getUserId(){
        return this.userId;
    }
}
