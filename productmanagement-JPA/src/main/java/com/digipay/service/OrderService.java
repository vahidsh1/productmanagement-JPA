package com.digipay.service;

import com.digipay.model.entity.Customer;
import com.digipay.model.entity.ElectricalDevice;
import com.digipay.model.entity.Order;
import com.digipay.repository.BaseRepository;
import com.digipay.repository.OrderRepository;

import java.util.List;

public class OrderService  extends BaseServiceImpl<Order> {
    OrderRepository orderRepository = new OrderRepository();

    public OrderService(BaseRepository repo) {
        super(repo);
    }

    @Override
    public List<Order> listOne(Order order) {
        List<Order> orderList = orderRepository.listAnEntity(order);
        return orderList;
    }
    @Override
    public List<Order> listAll(Order order) {
        List<Order> orderList = orderRepository.listEntity(order);
        return orderList;
    }

    @Override
    public void update(Order order) {
        orderRepository.updateEntity(order);
    }

    @Override
    public void delete(Order order) {
        orderRepository.deleteEntity(order);
    }
}
