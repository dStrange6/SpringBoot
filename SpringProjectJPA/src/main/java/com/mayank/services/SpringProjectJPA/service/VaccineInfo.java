package com.mayank.services.SpringProjectJPA.service;

import com.mayank.services.SpringProjectJPA.Vaccine;
import com.mayank.services.SpringProjectJPA.dao.VaccineRepo;
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

    @Override
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
        return vaccineRepo.saveAll(vaccines);

    }
}
