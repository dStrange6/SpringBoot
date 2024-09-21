package com.mayank.springboot01;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee 
{
    private Integer id;
    private String name;
    
    public Employee()
    {
        System.out.println("Employee bean created");
    }

    public void setValues()
    {
        this.id = 1;
        this.name = "Mayank Pathak";
    }

    public void printValues()
    {
        System.out.println(this.id + " -- " + this.name);
    }
}
