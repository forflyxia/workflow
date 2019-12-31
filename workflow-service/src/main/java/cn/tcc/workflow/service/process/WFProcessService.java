package cn.tcc.workflow.service.process;

import cn.tcc.workflow.contract.dto.common.KeyValueType;
import cn.tcc.workflow.contract.reqres.StartProcessRequest;
import cn.tcc.workflow.contract.reqres.StartProcessResponse;
import cn.tcc.workflow.service.BaseService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WFProcessService extends BaseService {

    @Autowired
    private WFProcessInstanceService processInstanceService;

    public StartProcessResponse startProcess(StartProcessRequest request) {

        Map<String, Object> variableMap = new HashMap<>();
        if (request.getVariables() != null) {
            for (KeyValueType variable : request.getVariables()) {
                variableMap.put(variable.getKey(), variable.getValue());
            }
        }
        ProcessInstance processInstance = processInstanceService.getProcessInstance(request.getProcessDefinitionKey(), request.getBusinessKey(), variableMap);
        StartProcessResponse response = new StartProcessResponse();
        return response;
    }

}
