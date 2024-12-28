package com.mayank.services.SpringDataJPA03.service;

import com.mayank.services.SpringDataJPA03.dao.Vaccine;
import com.mayank.services.SpringDataJPA03.dao.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class VaccineInfo implements IVaccineInfo {

    @Autowired
    VaccineRepo vaccineRepo;


    @Override
    public void deleteAllByVaccineObject(Iterable<Vaccine> vaccines) {

        vaccineRepo.deleteAll(vaccines);
    }

    @Override
    public Vaccine fetchByName(String vaccineName) {
        return vaccineRepo.findByVaccineName(vaccineName);
    }
}
