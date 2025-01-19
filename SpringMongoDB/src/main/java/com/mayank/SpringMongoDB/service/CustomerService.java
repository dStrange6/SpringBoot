package com.mayank.SpringMongoDB.service;

import com.mayank.SpringMongoDB.dao.Customer;
import com.mayank.SpringMongoDB.dao.ICustomerRepo;
import com.mayank.SpringMongoDB.dto.CustomerDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService
{

    @Autowired
    ICustomerRepo repo;

    @Override
    public String registerCustomer(CustomerDTO customer)
    {
        Customer c = new Customer();
        BeanUtils.copyProperties(customer,c);
        System.out.println(c.getName() + " " + c.getLocation() + " " + c.getAge());
        return "Customer Registered Successfully with ID : " + repo.save(c).getId();
    }

    @Override
    public String findById(String id)
    {
        Optional<Customer> optional = repo.findById(id);
        if(optional.isPresent())
            return optional.get().toString();
        return "Customer not found";
    }
}
