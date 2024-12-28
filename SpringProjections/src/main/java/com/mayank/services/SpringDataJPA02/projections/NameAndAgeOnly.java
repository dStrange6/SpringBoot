package com.mayank.services.SpringDataJPA02.projections;

public interface NameAndAgeOnly extends Projection
{
    public String getName();

    public Integer getAge();
}
