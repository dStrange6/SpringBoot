package com.mayank.SpringDataJPA02.dao;

import com.mayank.SpringDataJPA02.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepo extends JpaRepository<Vaccine, Integer> {
}
