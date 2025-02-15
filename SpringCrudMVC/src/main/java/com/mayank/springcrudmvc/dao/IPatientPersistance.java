package com.mayank.springcrudmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientPersistance extends JpaRepository<Patient, Integer>
{
}
