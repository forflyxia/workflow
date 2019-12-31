package cn.tcc.workflow;

import cn.tcc.workflow.contract.dto.task.TaskType;
import cn.tcc.workflow.contract.reqres.*;

public class Bootstrap {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "tc");
//        StartProcessRequest request = new StartProcessRequest();
//        request.setBusinessKey("111");
//        request.setProcessDefinitionKey("FinanceAudit");

//        PostRestClient<StartProcessRequest, StartProcessResponse> client = new PostRestClient();
//        StartProcessResponse response = client.call(request, StartProcessResponse.class);
//        long startTime =  System.currentTimeMillis();
//
//        for(int i=0;i<5000;i++){
//            testUserInfo("henry");
//        }
//        long endTime =  System.currentTimeMillis();
//        long usedTime = (endTime-startTime);
//        System.console().printf("用时毫秒：",usedTime);
//        testUserInfo("henry");
      //    testUserInfo("00T157");
     //  testUserInfo("henry");
        //  testDeleteMember();
        //testDeleteMember();
       // testUserTasks1();
       // testProcessInstances();
    }

    private static void testExecuteTask(){
        ExecuteTaskRequest taskRequest = new ExecuteTaskRequest();
        taskRequest.addPathVariables("taskId","37506");
        taskRequest.setAction("agree");
        ExecuteTaskResponse response = ServiceClient.call(taskRequest, ExecuteTaskResponse.class);
    }

    private static   void testProcessInstances(){
        ProcessInstancesRequest request =new ProcessInstancesRequest();
        //request.setId("2507");
        request.setProcessDefinitionKey("indemnity_audit_v1");
        request.addQueryVariables("size","100");
        ProcessInstancesResponse response = ServiceClient.call(request,ProcessInstancesResponse.class);
    }

    public static  void testUserTasks(){
        UserTasksRequest request =new UserTasksRequest();
        request.setProcessInstanceId("2507");

        UserTasksResponse response = ServiceClient.call(request,UserTasksResponse.class);
    }

    public static  void testProcessInstancesVariables(){
        ProcessInstancesVariablesRequest request =new ProcessInstancesVariablesRequest();
        request.addPathVariables("processInstanceId","2507");

        ProcessInstancesVariablesResponse response = ServiceClient.call(request,ProcessInstancesVariablesResponse.class);
    }

    public static  void testUserInfo(String userId){
        UserInfoRequest request =new UserInfoRequest();
        request.addPathVariables("userId",userId);
//        GetRestClient<UserInfoRequest,UserInfoResponse> client =new GetRestClient<>();
//        UserInfoResponse response = client.call(request,UserInfoResponse.class)
        UserInfoResponse response = ServiceClient.call(request,UserInfoResponse.class);
    }

    public  static  void testCreateUser(){
        CreateUserRequest request =new CreateUserRequest();
        request.setEmail("553563605@qq.com");
        request.setFirstName("wang");
        request.setLastName("yanjie");
        request.setPassword("111111");
        request.setPictureUrl("");
        request.setUrl("");
        request.setId("danny");
        //PostRestClient<CreateUserRequest,CreateUserResponse> client =new PostRestClient<>();


        CreateUserResponse response = ServiceClient.call(request,CreateUserResponse.class);

        //CreateUserResponse response = client.call(request,CreateUserResponse.class);
    }

    public static void testUserGroups(){
        UserGroupsRequest request =new UserGroupsRequest();
        request.setId("ROLE_ADMIN");

        UserGroupsResponse response = ServiceClient.call(request,UserGroupsResponse.class);
    }

    public static  void testAddMember(){
        AddMemberRequest request =new AddMemberRequest();
        request.setUserId("danny");
        request.addPathVariables("groupId","2");
        //GetRestClient<AddMemberRequest,AddMemberResponse> client =new GetRestClient<>();

        AddMemberResponse response = ServiceClient.call(request,AddMemberResponse.class);
    }

    public static void testDeleteMember(){
        DeleteMemberRequest request =new DeleteMemberRequest();
        request.addPathVariables("groupId","2");
        request.addPathVariables("userId","00T166");
        ServiceClient.call(request,DeleteMemberResponse.class);
    }

    public static  void testUserTaskInfo(){
        UserTaskInfoRequest request=new UserTaskInfoRequest();
        request.addPathVariables("taskId","12511");
        UserTaskInfoResponse response = ServiceClient.call(request,UserTaskInfoResponse.class);
        String taskType = response.getParentTaskId();
    }

    public static  void testHistoricActivityInstances(){
        HistoricActivityInstancesRequest request=new HistoricActivityInstancesRequest();
        request.setProcessInstanceId("50026");
        HistoricActivityInstancesResponse response = ServiceClient.call(request,HistoricActivityInstancesResponse.class);
    }

    public static  void testHistoricProcessInstances(){
        HistoricProcessInstancesRequest request =new HistoricProcessInstancesRequest();
        request.setBusinessKey("ordercompensate-217");
        HistoricProcessInstancesResponse response =ServiceClient.call(request,HistoricProcessInstancesResponse.class);
        response.getData();
    }

    public static void testUserTasks1(){
        UserTasksRequest request =new UserTasksRequest();
        request.setProcessDefinitionKey("indemnity_audit_v1");
        //request.setAssignee("00T155");
        UserTasksResponse response =ServiceClient.call(request,UserTasksResponse.class);
    }

}
