package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfResponse;
import cn.tcc.workflow.contract.dto.processinstance.ProcessInstanceType;

import java.util.List;

public class ProcessInstancesResponse extends WfResponse {

    private List<ProcessInstanceType> data;

    private int total;

    private int start;

    private String sort;

    private String order;

    private int size;

    public void setData(List<ProcessInstanceType> data){
        this.data = data;
    }
    public List<ProcessInstanceType> getData(){
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
