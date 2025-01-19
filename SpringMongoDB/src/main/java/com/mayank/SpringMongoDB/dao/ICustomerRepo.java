package com.mayank.SpringMongoDB.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends MongoRepository<Customer, String>
{

}
