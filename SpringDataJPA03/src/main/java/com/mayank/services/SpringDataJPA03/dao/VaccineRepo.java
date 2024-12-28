package com.mayank.services.SpringDataJPA03.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepo extends JpaRepository<Vaccine, Integer>
{
    // custom finder method -- syntax -- findBy<propertyName>
    Vaccine findByVaccineName(String vaccineName);

}
