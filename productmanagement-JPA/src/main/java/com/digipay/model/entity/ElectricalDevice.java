package com.digipay.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PMElectrical")
public class ElectricalDevice extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "PMEID")
    private int electricalDeviceID;

    @Column(name = "PMPOWERUSAGE")
    String powerUsage;

    @Column(name = "PMENERGYRATE")
    int energyRate;

    @Column(name = "PMBRAND")
    String brand;
    @Column(name="PMPRICE")
    double price;

    @Column(name="PMNID")
    String userNationalID;

    public int getElectricalDeviceID() {
        return electricalDeviceID;
    }

    public void setElectricalDeviceID(int electricalDeviceID) {
        this.electricalDeviceID = electricalDeviceID;
    }

    public String getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(String powerUsage) {
        this.powerUsage = powerUsage;
    }

    public int getEnergyRate() {
        return energyRate;
    }

    public void setEnergyRate(int energyRate) {
        this.energyRate = energyRate;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUserNationalID() {
        return userNationalID;
    }

    public void setUserNationalID(String userNationalID) {
        this.userNationalID = userNationalID;
    }

    @Override
    public String toString() {
        return "ElectricalDevice{" +
                "electricalDeviceID=" + electricalDeviceID +
                ", powerUsage='" + powerUsage + '\'' +
                ", energyRate=" + energyRate +
                ", price=" + price +
                "}\n";
    }
}