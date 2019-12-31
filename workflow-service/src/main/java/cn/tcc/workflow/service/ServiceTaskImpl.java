package cn.tcc.workflow.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class ServiceTaskImpl implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("cn.tcc.workflow.service.ServiceTaskImpl");
    }
}
