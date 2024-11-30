package com.mayank.SpringDataJPA02.service;

import com.mayank.SpringDataJPA02.Vaccine;
import com.mayank.SpringDataJPA02.dao.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
