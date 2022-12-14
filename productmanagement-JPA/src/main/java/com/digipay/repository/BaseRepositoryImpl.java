package com.digipay.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.Scanner;

public class BaseRepositoryImpl<T> implements BaseRepository<T>{
    Scanner scanner=new Scanner(System.in);
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

    @Override
    public void insertEntity(T t) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(t);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<T> listAnEntity(T t){return null;};

    @Override
    public List<T> listEntity(T t) {
        return null;
    }

    @Override
    public void updateEntity(T t) {

    }

    @Override
    public void deleteEntity(T t) {

    }


}
