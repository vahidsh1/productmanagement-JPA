package com.digipay.repository;

import com.digipay.model.entity.Customer;
import jakarta.persistence.Query;

import java.util.List;

public class CustomerRepository extends BaseRepositoryImpl<Customer>{

    public List<Customer> listAnEntity(Customer customer){
        List<Customer> entityList = (List<Customer>) entityManager.createQuery("SELECT a FROM Customer a where " +
                        "a.customerUserName= :name").setParameter("name",customer.getCustomerUserName()).getResultList();
        entityManager.close();
        return entityList;
    }

    public List<Customer> listEntity(Customer customer) {
        List<Customer> entityList = (List<Customer>) entityManager.createQuery("SELECT a FROM Customer a", Customer.class).getResultList();
        entityManager.close();
        return entityList;

    }

    @Override
    public void updateEntity(Customer customer) {
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("update Customer e set e.customerName= :name," +
                "e.customerContact= :contact, e.customerAddress= :address where customerID= :id");
        query.setParameter("name",customer.getCustomerName());
        query.setParameter("contact",customer.getCustomerContact());
        query.setParameter("address",customer.getCustomerAddress());
        query.setParameter("id",customer.getCustomerID());

        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteEntity(Customer customer) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Customer where  customerID=" + customer.getCustomerID());
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
