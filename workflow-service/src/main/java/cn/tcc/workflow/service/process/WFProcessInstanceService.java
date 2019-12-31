package cn.tcc.workflow.service.process;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WFProcessInstanceService {

    @Autowired
    private RuntimeService runtimeService;

    public ProcessInstance getProcessInstance(String processDefinitionKey, String businessKey) {
        return getProcessInstance(processDefinitionKey, businessKey, new HashMap<>());
    }

    public ProcessInstance getProcessInstance(String processDefinitionKey, String businessKey, Map<String, Object> variables) {
        ProcessInstanceQuery processInstanceQuery = runtimeService.createProcessInstanceQuery();
        processInstanceQuery = processInstanceQuery.processDefinitionKey(processDefinitionKey);
        processInstanceQuery = processInstanceQuery.processInstanceBusinessKey(businessKey);
        List<ProcessInstance> matchedProcessInstances = processInstanceQuery.list();
        if (matchedProcessInstances != null && !matchedProcessInstances.isEmpty()) {
            return matchedProcessInstances.get(0);
        } else {
            return createProcessInstance(processDefinitionKey, businessKey, variables);
        }
    }

    private ProcessInstance createProcessInstance(String processDefinitionKey, String businessKey, Map<String, Object> variables) {
        return runtimeService.startProcessInstanceByKey(processDefinitionKey, businessKey, variables);
    }
}
