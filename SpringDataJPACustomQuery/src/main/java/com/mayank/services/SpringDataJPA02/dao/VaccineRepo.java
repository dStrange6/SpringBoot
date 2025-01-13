package com.mayank.services.SpringDataJPA02.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VaccineRepo extends JpaRepository<Vaccine, Integer>
{
    @Query("FROM Vaccine WHERE vaccineCost < :cost")            //HQL Query with named parameters
    public List<Vaccine> searchVaccineByCostLessThan(double cost);      //no method naming convention as present in custom finder methods

    @Query("SELECT vaccineCost FROM Vaccine where vaccineName = :vaccineName")
    public List<String> getVaccineCostByName(@Param("vaccineName") String name);    //using @Param as named argument and function parameter are different

    @Transactional
    @Modifying
    @Query("UPDATE Vaccine SET vaccineCost =:newCost WHERE vaccineName=:name")
    public Integer updateCostByName(String name, Double newCost);
}
