package com.mayank.SpringCrudJDBC.dao;

import java.util.List;

public interface IEmployeePersistence
{
    List<Employee> getAllEmployee();

    Employee getEmployee(Integer id);

    boolean deleteEmployee(Integer id);

    Employee updateEmployee(Employee employee);

    void addEmployee(Employee employee);
}
