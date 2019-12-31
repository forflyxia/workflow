package cn.tcc.workflow.contract.dto.common;

public enum HttpMethodType {

    GET("GET"),
    POST("POST"),
    DELETE("DELETE"),
    PUT("PUT"),
    HEAD("HEAD");

    private String value;

    public String getValue(){
        return value;
    }

    private HttpMethodType(String value) {
        this.value = value;
    }

}
