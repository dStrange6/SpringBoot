package com.mayank.services.SpringDataJPA02.projections;

public interface NameAndSalaryOnly extends Projection
{
    public Double getSalary();
    public String getName();
}
