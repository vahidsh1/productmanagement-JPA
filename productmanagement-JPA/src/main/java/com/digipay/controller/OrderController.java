package com.digipay.controller;

import com.digipay.model.entity.Customer;
import com.digipay.model.entity.ElectricalDevice;
import com.digipay.model.entity.Order;
import com.digipay.repository.CustomerRepository;
import com.digipay.repository.DigitalRepository;
import com.digipay.repository.ElectricalRepository;
import com.digipay.repository.OrderRepository;
import com.digipay.service.CustomerService;
import com.digipay.service.DigitalService;
import com.digipay.service.ElectricalService;
import com.digipay.service.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OrderController {
    DigitalController digitalController = new DigitalController(2);
    ElectricalController electricalController = new ElectricalController(2);

    ElectricalRepository electricalRepository = new ElectricalRepository();
    ElectricalService electricalService = new ElectricalService(electricalRepository);

    DigitalRepository digitalRepository = new DigitalRepository();
    DigitalService digitalService = new DigitalService(digitalRepository);

    CustomerRepository customerRepository = new CustomerRepository();
    CustomerService customerService = new CustomerService(customerRepository);
    Customer customer = new Customer();

    OrderRepository orderRepository = new OrderRepository();
    OrderService orderService = new OrderService(orderRepository);
    Order order = new Order();

    Scanner scanner = new Scanner(System.in);
    int categoryType;
    int productID;

    public void orderRegisterOperation(Customer customer) {
        Messages.categoryMessage();
        categoryType = scanner.nextInt();
        switch (categoryType) {
            case (1): {
                digitalController.digitalOperation();
                break;
            }
            case (2): {
                electricalController.electricalOperation();
                break;
            }
            default: {
                System.out.println("Invalid input!");
                break;
            }

        }

        System.out.println("Enter ID of product:");
        //todo: let customer choose more than one product
        productID = scanner.nextInt();
        order.setOrderProductID(productID);
        order.setOrderStatus("Not Confirmed");
        order.setOrderProductCategory(categoryType);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        order.setOrderDate(formatter.format(currentDate));
        order.setCustomer(customer);
        orderService.create(order);
    }

    public void orderListOperation(Customer customer) {
        order.setCustomer(customer);
        List<Order> orderList = orderService.listOne(order);
        for (Order orderObject : orderList) {
            System.out.printf(orderObject.toString());
        }
    }
}
