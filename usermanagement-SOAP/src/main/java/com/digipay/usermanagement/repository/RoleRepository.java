package com.digipay.usermanagement.repository;

import com.digipay.usermanagement.model.entity.*;
import jakarta.persistence.Query;

import java.util.List;


public class RoleRepository extends BaseRepositoryImpl<Role> {
    @Override
    public List<Role> listEntity(Role role) {
        List<Role> entityList = (List<Role>) entityManager.createQuery("SELECT a FROM Role a", Role.class).getResultList();
        entityManager.close();
        return entityList;

    }
        @Override
        public void updateEntity (Role role) {
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("update Role e set e.roleTitle= :RTIT where roleID= :RID");
            query.setParameter("RTIT",role.getRoleTitle());
            query.setParameter("RID",role.getRoleID());
            query.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
        }
        @Override
        public void deleteEntity (Role role) {
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("delete from Role where  roleID=" + role.getRoleID());
            query.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
        }
}



