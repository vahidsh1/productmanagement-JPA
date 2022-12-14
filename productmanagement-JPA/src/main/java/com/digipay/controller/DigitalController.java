package com.digipay.controller;

import com.digipay.model.entity.DigitalDevice;
import com.digipay.repository.DigitalRepository;
import com.digipay.service.DigitalService;

import java.util.List;
import java.util.Scanner;

public class DigitalController {
    Scanner scanner = new Scanner(System.in);
    DigitalDevice digitalDevice = new DigitalDevice();
    DigitalRepository digitalRepository = new DigitalRepository();
    DigitalService digitalService = new DigitalService(digitalRepository);
    int operationType;
    String userNationalID;

    public DigitalController(int operationType) {
        this.operationType = operationType;
    }

    public DigitalController(int operationType, String userNationalID) {
        this.operationType = operationType;
        this.userNationalID = userNationalID;
    }

    public void digitalOperation() {
        switch (operationType) {
            case (1): {
                System.out.println("Enter CPU model:");
                String cpuModel = scanner.next();
                System.out.println("Enter RAM size:");
                int ramSize = scanner.nextInt();
                System.out.println("Enter brand name:");
                String brand = scanner.next();
                System.out.println("Enter price:");
                double price = scanner.nextDouble();

                digitalDevice.setCpuModel(cpuModel);
                digitalDevice.setRam(ramSize);
                digitalDevice.setBrand(brand);
                digitalDevice.setPrice(price);
                digitalDevice.setUserNationalID(userNationalID);

                digitalService.create(digitalDevice);
                break;
            }
            case (2): {
                List<DigitalDevice> digitalDeviceList = digitalService.listAll(digitalDevice);
                if (digitalDeviceList.size() > 0) {
                    for (DigitalDevice digitalObject : digitalDeviceList) {
                        System.out.printf(digitalObject.toString());
                    }
                } else {
                    System.out.println("No product exists in this category.");
                    throw new RuntimeException();
                }
                break;
            }

            case (3): {
                System.out.println("Enter digital device ID:");
                int digitalDeviceID = scanner.nextInt();
                System.out.println("Enter new CPU model:");
                String cpuModel = scanner.next();
                System.out.println("Enter new RAM size:");
                int ramSize = scanner.nextInt();
                System.out.println("Enter new brand name:");
                String brand = scanner.next();
                System.out.println("Enter new price:");
                double price = scanner.nextDouble();

                digitalDevice.setCpuModel(cpuModel);
                digitalDevice.setRam(ramSize);
                digitalDevice.setBrand(brand);
                digitalDevice.setPrice(price);
                digitalDevice.setDigitalDeviceID(digitalDeviceID);
                digitalService.update(digitalDevice);
                break;
            }

            case (4): {
                System.out.println("Enter Digital device ID: ");
                int digitalDeviceID = scanner.nextInt();
                digitalDevice.setDigitalDeviceID(digitalDeviceID);
                digitalService.delete(digitalDevice);
                break;
            }

        }
    }
}

