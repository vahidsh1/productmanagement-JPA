package com.digipay.controller;

import com.digipay.model.entity.Customer;
import com.digipay.repository.CustomerRepository;
import com.digipay.service.CustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);
    OrderController orderController=new OrderController();

    private String customerUserName;
    private String customerName;
    private String customerContact;
    private String customerAddress;


    public void customerOperation(int operationType) {
        Customer customer = new Customer();
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);

        switch (operationType) {

            case (1): {
                System.out.println("Enter username:");
                customerUserName = scanner.next();

                System.out.println("Enter name:");
                customerName=scanner.next();

                System.out.println("Enter contact:");
                customerContact = scanner.next();

                System.out.println("Enter address:");
                customerAddress=scanner.next();

                customer.setCustomerUserName(customerUserName);
                customer.setCustomerName(customerName);
                customer.setCustomerContact(customerContact);
                customer.setCustomerAddress(customerAddress);
                customerService.create(customer);
                orderController.orderRegisterOperation(customer);
                break;

            }
            case (2): {
                System.out.println("Enter username:");
                customerUserName = scanner.next();
                customer.setCustomerUserName(customerUserName);
                List<Customer> customerList= customerService.listOne(customer);
                //todo: managing customer list
                if (customerList.size()!=0){
                    customer = customerList.get(0);
                    orderController.orderRegisterOperation(customer);
                }
                else {throw new RuntimeException();}
                break;

            }
            case (3): {
                System.out.println("Enter username:");
                customerUserName = scanner.next();
                customer.setCustomerUserName(customerUserName);
                List<Customer> customerList= customerService.listOne(customer);
                orderController.orderListOperation(customerList.get(0));

                break;

            }
            default: { System.out.println("Invalid input!");break;}
        }
    }
}
