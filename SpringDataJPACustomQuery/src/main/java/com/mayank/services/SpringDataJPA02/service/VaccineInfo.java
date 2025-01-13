package com.mayank.services.SpringDataJPA02.service;

import com.mayank.services.SpringDataJPA02.dao.Vaccine;
import com.mayank.services.SpringDataJPA02.dao.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineInfo implements IVaccineInfo {

    @Autowired
    VaccineRepo vaccineRepo;

    @Override
    public Vaccine addVaccine(Vaccine vaccine) {
        return vaccineRepo.save(vaccine);
    }

    @Override
    public Optional<Vaccine> getVaccineById(Integer id) {
        return vaccineRepo.findById(id);
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
        return vaccineRepo.saveAll(vaccines);

    }

    @Override
    public List<Vaccine> findVaccineByCostLessThan(double cost) {
        return vaccineRepo.searchVaccineByCostLessThan(cost);
    }

    @Override
    public List<String> findVaccineCostByName(String name) {
        return vaccineRepo.getVaccineCostByName(name);
    }

    @Override
    public Integer updateVaccineCostByVaccineName(String name, Double newCost) {
        return vaccineRepo.updateCostByName(name, newCost);
    }
}
