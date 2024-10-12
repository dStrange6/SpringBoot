package com.mayank.SpringDataJDBC;

import com.mayank.SpringDataJDBC.dao.SpringDao;
import com.mayank.SpringDataJDBC.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentCommandLineRunner implements CommandLineRunner
{
    @Autowired
    private SpringDao dao;

    public StudentCommandLineRunner()
    {
        System.out.println("Bean of StudentCLR Created .....");
    }

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("Inside CommandLineRunner method .....");
        dao.insert(new Student(1,"Mayank","CS"));
    }
}
