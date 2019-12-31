package cn.tcc.workflow.contract.dto.common;

public class VariableType {

    private String name;
    private String scope;
    private String type;
    private String value;
    private String valueUrl;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
    public String getScope() {
        return scope;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public void setValueUrl(String valueUrl) {
        this.valueUrl = valueUrl;
    }
    public String getValueUrl() {
        return valueUrl;
    }

}
