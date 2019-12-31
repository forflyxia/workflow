package cn.tcc.workflow.contract.reqres;

import cn.tcc.workflow.contract.WfRequest;
import cn.tcc.workflow.contract.annotation.ClientRequestAttribute;
import cn.tcc.workflow.contract.dto.common.HttpMethodType;

@ClientRequestAttribute( httpMethod = HttpMethodType.POST, path = "/workflow/identity/users")
public class CreateUserRequest extends WfRequest {

    private String email;
    private String firstName;
    private String id;
    private String lastName;
    private String password;
    private String pictureUrl;
    private String url;

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPictureUrl(String pictureUrl){
        this.pictureUrl = pictureUrl;
    }
    public String getPictureUrl(){
        return this.pictureUrl;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
}
