package cn.tcc.workflow.contract;

import cn.tcc.workflow.contract.dto.common.KeyValueType;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class WfRequest implements Serializable {

    @JSONField(serialize=false)
    private transient List<KeyValueType> pathVariables = new ArrayList();

    @JSONField(serialize=false)
    private transient List<KeyValueType> queryVariables = new ArrayList();

    public List<KeyValueType> getPathVariables() {
        return pathVariables;
    }

    public void setPathVariables(List<KeyValueType> pathVariables) {
        this.pathVariables = pathVariables;
    }

    public List<KeyValueType> getQueryVariables() {
        return queryVariables;
    }

    public void setQueryVariables(List<KeyValueType> queryVariables) {
        this.queryVariables = queryVariables;
    }

    public void addPathVariables(String key, String value){
        KeyValueType keyValueType =new KeyValueType();
        keyValueType.setKey(key);
        keyValueType.setValue(value);
        pathVariables.add(keyValueType);
    }

    public void addQueryVariables(String key, String value){
        KeyValueType keyValueType =new KeyValueType();
        keyValueType.setKey(key);
        keyValueType.setValue(value);
        queryVariables.add(keyValueType);
    }
}
