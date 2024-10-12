package com.mayank.SpringDataJDBC.dao;

import org.springframework.stereotype.Component;

@Component
public class Student
{
    private Integer id;
    private String name;
    private String branch;

    public Student()
    {

    }
    public Student(Integer id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }

}
