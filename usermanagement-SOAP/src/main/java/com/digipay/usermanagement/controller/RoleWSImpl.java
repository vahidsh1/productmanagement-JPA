package com.digipay.usermanagement.controller;

import com.digipay.usermanagement.model.entity.*;
import com.digipay.usermanagement.repository.*;
import com.digipay.usermanagement.service.*;
import jakarta.jws.WebService;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
@WebService(endpointInterface = "com.digipay.usermanagement.controller.RoleWS")
public class RoleWSImpl implements RoleWS{

    @Override
    public void createRole(String roleTitle, Long permissionID) {

        Role role = new Role();
        Permission permission = new Permission();
        Set<Permission> permissionSet = new HashSet<Permission>();
        RoleRepository roleRepository = new RoleRepository();
        BaseService<Role> roleService = new RoleService(roleRepository);
        permission.setPermissionID(permissionID);
        permissionSet.add(permission);
        role.setPermissions(permissionSet);
        role.setRoleTitle(roleTitle);
        roleService.create(role);
    }

    @Override
    public List<Role> listRoles() {
        Role role = new Role();
        RoleRepository roleRepository = new RoleRepository();
        BaseService<Role> roleService = new RoleService(roleRepository);
//        Permission permission = new Permission();
//        Set<Permission> permissionSet = new HashSet<Permission>();
        List<Role> roleList = roleService.listAll(role);
        for (Role roleObject : roleList) {
            System.out.println(roleObject.toString());
        }
        return roleList;
    }

    @Override
    public void updateRole(Long roleID, String roleTitle) {
        Role role = new Role();
        RoleRepository roleRepository = new RoleRepository();
        BaseService<Role> roleService = new RoleService(roleRepository);
        role.setRoleTitle(roleTitle);
        role.setRoleID(roleID);
        roleService.update(role);
    }

    @Override
    public void deleteRole(Long roleID) {
        Role role = new Role();
        RoleRepository roleRepository = new RoleRepository();
        BaseService<Role> roleService = new RoleService(roleRepository);
        role.setRoleID(roleID);
        roleService.delete(role);
    }
}
