package com.mayank.services.SpringDataJPA02.dao;

import com.mayank.services.SpringDataJPA02.projections.NameAndAgeOnly;
import com.mayank.services.SpringDataJPA02.projections.Projection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //static projection
    public Collection<NameAndAgeOnly> findBySalaryGreaterThan(Double salary);

    //dynamic projection, upper bound wildcard generics used
    public <T extends Projection>Collection<T> findByAgeLessThan(Integer Age, Class<T> cls);
}
