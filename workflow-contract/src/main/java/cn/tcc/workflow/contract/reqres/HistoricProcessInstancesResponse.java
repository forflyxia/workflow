package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfResponse;
import cn.tcc.workflow.contract.dto.processinstance.HistoricProcessInstanceType;

import java.util.List;

public class HistoricProcessInstancesResponse extends WfResponse {
    private List<HistoricProcessInstanceType> data;
    private int total;
    private int start;
    private String sort;
    private String order;
    private int size;
    public void setData(List<HistoricProcessInstanceType> data) {
        this.data = data;
    }
    public List<HistoricProcessInstanceType> getData() {
        return data;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal() {
        return total;
    }

    public void setStart(int start) {
        this.start = start;
    }
    public int getStart() {
        return start;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
    public String getSort() {
        return sort;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    public String getOrder() {
        return order;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
}
