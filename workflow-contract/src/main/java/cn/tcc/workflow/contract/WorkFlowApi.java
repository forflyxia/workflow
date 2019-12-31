package cn.tcc.workflow.contract;

import cn.tcc.workflow.contract.reqres.*;

public interface WorkFlowApi {

    StartProcessResponse startProcess(StartProcessRequest request);

    UserTasksResponse userTasks(UserTasksRequest request);

}
