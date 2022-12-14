package com.digipay.repository;

import com.digipay.model.entity.Order;
import jakarta.persistence.Query;

import java.util.List;

public class OrderRepository extends BaseRepositoryImpl<Order>{

    public List<Order> listAnEntity(Order order){
        List<Order> entityList = (List<Order>) entityManager.createQuery("SELECT a FROM Order a where " +
                "a.customer.customerID= :customerid").setParameter("customerid",order.getCustomer().getCustomerID()).getResultList();
        entityManager.close();
        return entityList;
    }

    public List<Order> listEntity(Order order) {
        List<Order> entityList = (List<Order>) entityManager.createQuery("SELECT a FROM Order a", Order.class).getResultList();
        entityManager.close();
        return entityList;

    }

    @Override
    public void updateEntity(Order order) {
    //todo:
        System.out.println("Update not available yet.");
    }

    @Override
    public void deleteEntity(Order order) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Order where  orderID=" + order.getOrderID());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
