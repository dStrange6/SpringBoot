package com.mayank.services.SpringProjectJPA.dao;

import com.mayank.services.SpringProjectJPA.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepo extends JpaRepository<Vaccine, Integer> {
}
