package com.digipay.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "PMORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "PMOID")
    private int orderID;

    @Column(name = "PMODATE")
    private String orderDate;

    @Column(name = "PMOPID")
    private int orderProductID;

    @Column(name = "PMOPCATEGORY")
    private int orderProductCategory;

    @Column(name = "PMOSTATUS")
    private String orderStatus;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "PMCID")
    private Customer customer;


    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderProductID() {
        return orderProductID;
    }

    public void setOrderProductID(int orderProductID) {
        this.orderProductID = orderProductID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderProductCategory() {
        return orderProductCategory;
    }

    public void setOrderProductCategory(int orderProductCategory) {
        this.orderProductCategory = orderProductCategory;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderDate='" + orderDate + '\'' +
                ", orderProductID=" + orderProductID +
                ", customer=" + customer +
                ", orderProductCategory=" + orderProductCategory +
                ", orderStatus='" + orderStatus + '\'' +
                "}\n";
    }
}
