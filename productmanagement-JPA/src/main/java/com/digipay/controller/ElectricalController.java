package com.digipay.controller;

import com.digipay.model.entity.DigitalDevice;
import com.digipay.model.entity.ElectricalDevice;
import com.digipay.repository.ElectricalRepository;
import com.digipay.service.ElectricalService;

import java.util.List;
import java.util.Scanner;

public class ElectricalController {
    Scanner scanner = new Scanner(System.in);
    ElectricalDevice electricalDevice = new ElectricalDevice();
    ElectricalRepository electricalRepository = new ElectricalRepository();
    ElectricalService electricalService = new ElectricalService(electricalRepository);
    int operationType;
    String userNationalID;

    public ElectricalController(int operationType) {
        this.operationType = operationType;
    }

    public ElectricalController(int operationType, String userNationalID) {
        this.operationType = operationType;
        this.userNationalID=userNationalID;
    }

    public void electricalOperation() {


        switch (operationType) {
            case (1): {
                System.out.println("Enter power usage:");
                String powerUsage = scanner.next();
                System.out.println("Enter energy rate:");
                int energyRate = scanner.nextInt();
                System.out.println("Enter brand name:");
                String brand = scanner.next();
                System.out.println("Enter price:");
                double price = scanner.nextDouble();

                electricalDevice.setEnergyRate(energyRate);
                electricalDevice.setPowerUsage(powerUsage);
                electricalDevice.setBrand(brand);
                electricalDevice.setPrice(price);
                electricalDevice.setUserNationalID(userNationalID);

                electricalService.create(electricalDevice);
                break;
            }
            case (2): {
                List<ElectricalDevice> electricalDeviceList = electricalService.listAll(electricalDevice);
                if (electricalDeviceList.size() > 0) {
                    for (ElectricalDevice electricalObject : electricalDeviceList) {
                        System.out.printf(electricalObject.toString());
                    }
                } else {
                    System.out.println("No product exists in this category.");
                    throw new RuntimeException();
                }
                break;
            }

            case (3): {
                System.out.println("Enter electrical device ID:");
                int electricalDeviceID = scanner.nextInt();
                System.out.println("Enter new power usage:");
                String powerUsage = scanner.next();
                System.out.println("Enter new energy rate:");
                int energyRate = scanner.nextInt();
                System.out.println("Enter new brand name:");
                String brand = scanner.next();
                System.out.println("Enter new price:");
                double price = scanner.nextDouble();

                electricalDevice.setEnergyRate(energyRate);
                electricalDevice.setPowerUsage(powerUsage);
                electricalDevice.setBrand(brand);
                electricalDevice.setPrice(price);
                electricalDevice.setElectricalDeviceID(electricalDeviceID);

                electricalService.update(electricalDevice);
                break;
            }

            case (4): {
                System.out.println("Enter Electrical device ID: ");
                int electricalDeviceID = scanner.nextInt();
                electricalDevice.setElectricalDeviceID(electricalDeviceID);
                electricalService.delete(electricalDevice);
                break;
            }

        }
    }

}
