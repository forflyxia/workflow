package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfResponse;
import cn.tcc.workflow.contract.dto.user.GroupInfoType;

import java.util.List;

public class UserGroupsResponse extends WfResponse {
    private List<GroupInfoType> data;

    private int total;

    private int start;

    private String sort;

    private String order;

    private int size;

    public void setData(List<GroupInfoType> data){
        this.data = data;
    }
    public List<GroupInfoType> getData(){
        return this.data;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }
    public void setStart(int start){
        this.start = start;
    }
    public int getStart(){
        return this.start;
    }
    public void setSort(String sort){
        this.sort = sort;
    }
    public String getSort(){
        return this.sort;
    }
    public void setOrder(String order){
        this.order = order;
    }
    public String getOrder(){
        return this.order;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
}
