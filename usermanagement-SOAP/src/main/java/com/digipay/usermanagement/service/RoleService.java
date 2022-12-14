package com.digipay.usermanagement.service;

import com.digipay.usermanagement.model.entity.*;
import com.digipay.usermanagement.repository.*;

import java.util.List;


public class RoleService extends BaseServiceImpl<Role> {
    RoleRepository roleRepository = new RoleRepository();

    public RoleService(BaseRepository<Role> repo) {
        super(repo);

    }
    @Override
    public List<Role> listAll(Role role) {
        List<Role> roleList = roleRepository.listEntity(role);
        return roleList;
    }
    @Override
    public void update(Role role) {
        roleRepository.updateEntity(role);
    }
    @Override
    public void delete(Role role) {
        roleRepository.deleteEntity(role);
    }
}

