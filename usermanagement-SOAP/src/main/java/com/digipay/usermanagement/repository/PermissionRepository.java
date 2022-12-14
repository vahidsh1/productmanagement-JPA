package com.digipay.usermanagement.repository;

import com.digipay.usermanagement.model.entity.Permission;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;
import java.util.Scanner;
public class PermissionRepository extends BaseRepositoryImpl<Permission> {

    @Override
    public List<Permission> listEntity(Permission permission) {
        List<Permission> entityList = (List<Permission>) entityManager.createQuery("SELECT a FROM Permission a", Permission.class).getResultList();
        entityManager.close();
        return entityList;

    }
    @Override
    public void updateEntity(Permission permission){
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("update Permission e set e.permissionTitle= :title where permissionID= :id");
        query.setParameter("title",permission.getPermissionTitle());
        query.setParameter("id",permission.getPermissionID());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    @Override
    public void deleteEntity(Permission permission){
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Permission where  permissionID=" + permission.getPermissionID());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
