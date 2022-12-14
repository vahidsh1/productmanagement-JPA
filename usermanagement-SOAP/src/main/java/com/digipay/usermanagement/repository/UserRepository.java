package com.digipay.usermanagement.repository;

import com.digipay.usermanagement.model.entity.*;
import com.digipay.usermanagement.service.BaseServiceImpl;
import jakarta.persistence.*;

import java.util.List;
import java.util.Scanner;

    public class UserRepository extends BaseRepositoryImpl<User> {
        @Override
        public List<User> listEntity(User user) {
            List<User> entityList = (List<User>) entityManager.createQuery("SELECT a FROM User a", User.class).getResultList();
            entityManager.close();
            return entityList;

        }
        @Override
        public User listAnEntity(User user) {
            List<User> entityList = (List<User>) entityManager.createQuery("SELECT a FROM User a where a.username= :name").setParameter("name",user.getUsername()).getResultList();
            User user1 = entityList.get(0);
            entityManager.close();
            return user1;

        }
        @Override
            public void updateEntity (User user) {
            entityManager.getTransaction().begin();

            Query query = entityManager.createQuery("update User e set e.username= :name,e.nationalID= :NID," +
                " e.role.roleID= :RID where userID= :id");
            query.setParameter("name",user.getUsername());
            query.setParameter("NID",user.getNationalID());
            query.setParameter("RID",user.getRole().getRoleID());
            query.setParameter("id",user.getUserID());

            query.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
    }
    @Override
    public void deleteEntity (User user) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from User where  userID=" + user.getUserID());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}

