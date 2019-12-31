package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.HttpMethodType;

@ClientRequestAttribute( httpMethod = HttpMethodType.GET, path = "/workflow/identity/groups")
public class UserGroupsRequest extends WfRequest {

    private String id;
    private String name;
    private String type;
    private String member;
    private String potentialStarter;
    private String sort;
    private String nameLike;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getPotentialStarter() {
        return potentialStarter;
    }

    public void setPotentialStarter(String potentialStarter) {
        this.potentialStarter = potentialStarter;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }


}
