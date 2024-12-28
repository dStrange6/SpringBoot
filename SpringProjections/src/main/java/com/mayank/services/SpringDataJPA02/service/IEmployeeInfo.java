package com.mayank.services.SpringDataJPA02.service;

import com.mayank.services.SpringDataJPA02.dao.Employee;
import com.mayank.services.SpringDataJPA02.projections.NameAndAgeOnly;
import com.mayank.services.SpringDataJPA02.projections.Projection;

import java.util.Collection;
import java.util.List;

public interface IEmployeeInfo
{
    public Collection<NameAndAgeOnly> fetchBySalaryGreaterThan(Double salary);
    public List<Employee> addAllEmployees(Iterable<Employee> employees);
    public <T extends Projection>Collection<T> fetchByAgeLessThan(Integer Age, Class<T> cls);
}
