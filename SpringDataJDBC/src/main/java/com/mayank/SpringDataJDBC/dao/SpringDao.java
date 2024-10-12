package com.mayank.SpringDataJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDao
{
    private static final String SQL_INSERT = "insert into student values(?,?,?)";

    @Autowired
    private JdbcTemplate jdbc;

    public void insert(Student student)
    {
        System.out.println("Inside insert logic ......");
        jdbc.update(SQL_INSERT, student.getId(), student.getName(),student.getBranch());
    }
}
