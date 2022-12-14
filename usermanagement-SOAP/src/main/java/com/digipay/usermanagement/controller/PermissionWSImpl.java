package com.digipay.usermanagement.controller;

import com.digipay.usermanagement.model.entity.Permission;
import com.digipay.usermanagement.repository.PermissionRepository;
import com.digipay.usermanagement.service.BaseService;
import com.digipay.usermanagement.service.PermissionService;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "com.digipay.usermanagement.controller.PermissionWS")
public class PermissionWSImpl implements PermissionWS {


    public void createPermission(String permissionTitle) {
        PermissionRepository permissionRepository = new PermissionRepository();
        BaseService<Permission> permissionService = new PermissionService(permissionRepository);
        Permission permission = new Permission();
        permission.setPermissionTitle(permissionTitle);
        permissionService.create(permission);
    }

    public List<Permission> listPermissions() {
        PermissionRepository permissionRepository = new PermissionRepository();
        BaseService<Permission> permissionService = new PermissionService(permissionRepository);
        Permission permission = new Permission();
        List<Permission> permissionList = permissionService.listAll(permission);
        for (Permission permissionId : permissionList) {
            System.out.printf(permissionId.toString());
        }
        return permissionList;
    }

    public void updatePermission(Long permissionID,String permissionTitle){
        PermissionRepository permissionRepository = new PermissionRepository();
        BaseService<Permission> permissionService = new PermissionService(permissionRepository);
        Permission permission = new Permission();
        permission.setPermissionTitle(permissionTitle);
        permission.setPermissionID(permissionID);
        permissionService.update(permission);
    }
    public void deletePermission(Long permissionID){
        PermissionRepository permissionRepository = new PermissionRepository();
        BaseService<Permission> permissionService = new PermissionService(permissionRepository);
        Permission permission = new Permission();
        permission.setPermissionID(permissionID);
        permissionService.delete(permission);
    }

}

