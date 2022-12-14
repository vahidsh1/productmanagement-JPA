package com.digipay.model.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PMDigital")
public class DigitalDevice extends Product{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "PMDID")
    private int digitalDeviceID;

    @Column(name = "PMCPUMODEL")
    String cpuModel;

    @Column(name = "PMRAM")
    int ram;

    @Column(name = "PMBRAND")
    String brand;

    @Column(name="PMPRICE")
    double price;

    @Column(name="PMNID")
    String userNationalID;
    public int getDigitalDeviceID() {
        return digitalDeviceID;
    }

    public void setDigitalDeviceID(int digitalDeviceID) {
        this.digitalDeviceID = digitalDeviceID;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getUserNationalID() {
        return userNationalID;
    }

    public void setUserNationalID(String userNationalID) {
        this.userNationalID = userNationalID;
    }

    @Override
    public String toString() {
        return "DigitalDevice{" +
                "digitalDeviceID=" + digitalDeviceID +
                ", cpuModel='" + cpuModel + '\'' +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                "}\n";
    }
}
