package com.mayank.SpringDataJPA01.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository -- optional to put
public interface IStudentRepo extends JpaRepository<Employee, Integer> {
}
