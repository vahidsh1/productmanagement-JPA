package com.digipay.usermanagement.controller;

import com.digipay.usermanagement.model.entity.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
    public interface RoleWS {
        @WebMethod
        void createRole(String roleTitle, Long permissionID);
        @WebMethod
        List<Role> listRoles();
        @WebMethod
        void updateRole(Long roleID,String roleTitle);
        @WebMethod
        void deleteRole(Long roleID);
}
