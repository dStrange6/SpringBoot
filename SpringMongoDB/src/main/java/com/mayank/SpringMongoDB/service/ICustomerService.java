package com.mayank.SpringMongoDB.service;

import com.mayank.SpringMongoDB.dao.Customer;
import com.mayank.SpringMongoDB.dto.CustomerDTO;

import java.util.Optional;

public interface ICustomerService
{
    String registerCustomer(CustomerDTO customer);
    String findById(String id);
}
