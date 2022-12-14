package com.digipay.usermanagement.controller;

import com.digipay.usermanagement.model.entity.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface UserWS {
    @WebMethod
    void createUser(String username, String userNationalID,Long userRoleId);

    @WebMethod
    List<User> listUsers();
    @WebMethod
    User listAUser(String userName);

    @WebMethod
    void updateUser(Long userID, String username, String userNationalID, Long userRoleId);

    @WebMethod
    void deleteUser(Long userID);
}
