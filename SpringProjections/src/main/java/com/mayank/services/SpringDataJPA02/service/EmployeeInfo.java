package com.mayank.services.SpringDataJPA02.service;

import com.mayank.services.SpringDataJPA02.dao.Employee;
import com.mayank.services.SpringDataJPA02.dao.EmployeeRepository;
import com.mayank.services.SpringDataJPA02.projections.NameAndAgeOnly;
import com.mayank.services.SpringDataJPA02.projections.Projection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeInfo implements IEmployeeInfo
{
    @Autowired
    EmployeeRepository repo;

    @Override
    public Collection<NameAndAgeOnly> fetchBySalaryGreaterThan(Double salary) {
        return repo.findBySalaryGreaterThan(salary);

    }

    @Override
    public List<Employee> addAllEmployees(Iterable<Employee> employees) {
        return repo.saveAll(employees);
    }

    @Override
    public <T extends Projection> Collection<T> fetchByAgeLessThan(Integer Age, Class<T> cls) {
        return repo.findByAgeLessThan(Age, cls);
    }
}
