package com.digipay.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;


@Entity
@Table(name = "PMCUSTOMER")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "PMCID")
    private int customerID;

    @Column(name = "PMCUSERNAME")
    private String customerUserName;

    @Column(name = "PMCNAME")
    private String customerName;

    @Column(name = "PMCCONTACT")
    private String customerContact;

    @Column(name = "PMCADDRESS")
    private String customerAddress;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerUserName='" + customerUserName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerContact='" + customerContact + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                "}\n";
    }
}
