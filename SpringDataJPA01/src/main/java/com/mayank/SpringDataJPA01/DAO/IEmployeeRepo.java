package com.mayank.SpringDataJPA01.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository -- optional to put
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
}
