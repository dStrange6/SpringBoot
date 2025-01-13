package com.mayank.services.SpringDataJPA02.service;

import com.mayank.services.SpringDataJPA02.dao.Vaccine;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IVaccineInfo
{
    Vaccine addVaccine(Vaccine vaccine);

    Optional<Vaccine> getVaccineById(Integer id);

    Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);

    public List<Vaccine> findVaccineByCostLessThan(double cost);

    public List<String> findVaccineCostByName(String name);

    public Integer updateVaccineCostByVaccineName(String name, Double newCost);
}
