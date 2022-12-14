package com.digipay.controller;

import com.digipay.enums.UserTypes;
import com.digipay.model.entity.Customer;

import java.util.Scanner;

public class Main {
    static String userDescription;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operationType;
        int categoryType;
        //
        Messages.startMessage();
        int userType = scanner.nextInt();
        switch (userType) {
            case (1): {
                userDescription = UserTypes.Employee.toString();
                break;
            }
            case (2): {
                userDescription = UserTypes.Customer.toString();
                break;
            }
            default: {
                System.out.println("Invalid input!");
                break;
            }
        }
        //
        if (userDescription.equals(UserTypes.Employee.toString())) {

            while (true) {
                Messages.employeeWelcomeMessage();
                operationType = scanner.nextInt();
                //
                Messages.userMessage();
                String userName = scanner.next();

                AccessController accessController = new AccessController(userName, operationType);
                String userNationalID = accessController.checkAccess();

                Messages.categoryMessage();
                categoryType = scanner.nextInt();
                //
                switch (categoryType) {
                    case (1): {
                        DigitalController digitalController = new DigitalController(operationType, userNationalID);
                        digitalController.digitalOperation();
                        break;
                    }
                    case (2): {
                        ElectricalController electricalController = new ElectricalController(operationType, userNationalID);
                        electricalController.electricalOperation();
                        break;
                    }
                    default:
                        System.out.println("Invalid input!");

                }
            }

        } else if (userDescription.equals(UserTypes.Customer.toString())) {
            while (true) {
                Messages.customerWelcomeMessage();
                operationType = scanner.nextInt();
                CustomerController customerController = new CustomerController();
                customerController.customerOperation(operationType);
            }
        }
    }
}
