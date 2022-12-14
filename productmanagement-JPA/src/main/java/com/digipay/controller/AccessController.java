package com.digipay.controller;

import com.digipay.enums.OperationTypes;
import external.client.generated.Permission;

import external.client.generated.User;
import external.client.generated.UserWS;
import external.client.generated.UserWSImplService;


import java.util.ArrayList;
import java.util.List;

public class AccessController {
    private String userName;
    private int operationType;
    private String operationDescription;
    private boolean accessFlag;

    public AccessController(String userName, int operationType) {
        this.userName = userName;
        this.operationType = operationType;
    }

    public String checkAccess() {
        UserWSImplService userWSImplService=new UserWSImplService();
        UserWS userWSImplPort = userWSImplService.getUserWSImplPort();
        User user = userWSImplPort.listAUser(userName);
        List<Permission> permissionList = user.getRole().getPermissions();
        operationDescription= operationTypeConversion();
        for (Permission permission:permissionList) {
              accessFlag=(permission.getPermissionTitle()).equals(operationDescription);
        }
        if (accessFlag==true)
            return user.getNationalID();
        else throw new RuntimeException();
    }
    public String operationTypeConversion(){
        switch (operationType){
            case(1): {operationDescription=OperationTypes.Register.toString();break;}
            case(2): {operationDescription=OperationTypes.List.toString();break;}
            case(3): {operationDescription=OperationTypes.Update.toString();break;}
            case(4): {operationDescription=OperationTypes.Delete.toString();break;}
        }
        return operationDescription;
    }

}
