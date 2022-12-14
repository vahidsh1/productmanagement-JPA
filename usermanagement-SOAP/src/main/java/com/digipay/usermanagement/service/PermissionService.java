package com.digipay.usermanagement.service;

import com.digipay.usermanagement.model.entity.*;
import com.digipay.usermanagement.repository.*;


import java.util.List;


public class PermissionService extends BaseServiceImpl<Permission> {
    PermissionRepository permissionRepository = new PermissionRepository();

    public PermissionService(BaseRepository<Permission> repo) {
        super(repo);

    }
    @Override
    public List<Permission> listAll(Permission permission) {
        List<Permission> permissionList = permissionRepository.listEntity(permission);
        return permissionList;
    }

    @Override
    public void update(Permission permission) {

        permissionRepository.updateEntity(permission);
    }

    @Override
    public void delete(Permission permission) {
        permissionRepository.deleteEntity(permission);
    }
}