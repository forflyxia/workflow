package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfResponse;
import cn.tcc.workflow.contract.dto.common.VariableType;

import java.util.List;

public class ProcessInstancesVariablesResponse extends WfResponse {
    public List<VariableType> getData() {
        return data;
    }

    public void setData(List<VariableType> data) {
        this.data = data;
    }

    private List<VariableType> data;
}
