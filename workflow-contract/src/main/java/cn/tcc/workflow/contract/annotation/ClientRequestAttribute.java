package cn.tcc.workflow.contract.annotation;

import cn.tcc.workflow.contract.dto.common.HttpMethodType;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClientRequestAttribute {

	HttpMethodType httpMethod();

	String path() default "";
}
