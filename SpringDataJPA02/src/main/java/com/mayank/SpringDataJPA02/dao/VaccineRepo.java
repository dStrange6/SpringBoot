package com.mayank.SpringDataJPA02.dao;

import com.mayank.SpringDataJPA02.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface VaccineRepo extends CrudRepository<Vaccine, Integer> {
}
