package com.digipay.usermanagement.service;

import com.digipay.usermanagement.model.entity.*;
import com.digipay.usermanagement.repository.*;

import java.util.List;

public class UserService extends BaseServiceImpl<User> {
    UserRepository userRepository = new UserRepository();

    public UserService(BaseRepository<User> repo) {
        super(repo);

    }
    @Override
    public List<User> listAll(User user) {
        List<User> userList = userRepository.listEntity(user);
        return userList;
    }

    @Override
    public User listAUser(User user) {
        User returneduser = userRepository.listAnEntity(user);
        return returneduser;
    }
    @Override
    public void update(User user) {
        userRepository.updateEntity(user);
    }
    @Override
    public void delete(User user) {
        userRepository.deleteEntity(user);
    }
}

