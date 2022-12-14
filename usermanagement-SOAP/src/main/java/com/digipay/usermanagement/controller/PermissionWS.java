package com.digipay.usermanagement.controller;

import com.digipay.usermanagement.model.entity.Permission;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface PermissionWS {
    @WebMethod
    void createPermission(String content);
    @WebMethod
    List<Permission> listPermissions();
    @WebMethod
    void updatePermission(Long permissionID,String permissionTitle);
    @WebMethod
    void deletePermission(Long permissionID);
}
