package cn.tcc.workflow.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

}
