package com.digipay.service;

import com.digipay.model.entity.Customer;
import com.digipay.repository.BaseRepository;
import com.digipay.repository.CustomerRepository;

import java.util.List;

public class CustomerService extends BaseServiceImpl<Customer> {
    CustomerRepository customerRepository = new CustomerRepository();

    public CustomerService(BaseRepository repo) {
        super(repo);
    }

    @Override
    public List<Customer> listOne(Customer customer) {
        List<Customer> customerList = customerRepository.listAnEntity(customer);
        return customerList;
    }

    @Override
    public List<Customer> listAll(Customer customer) {
        List<Customer> customerList = customerRepository.listEntity(customer);
        return customerList;
    }

    @Override
    public void update(Customer customer) {
        customerRepository.updateEntity(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.deleteEntity(customer);
    }


}





