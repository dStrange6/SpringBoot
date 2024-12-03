package com.mayank.services.SpringProjectJPA.service;

import com.mayank.services.SpringProjectJPA.Vaccine;

import java.util.Optional;

public interface IVaccineInfo
{
    Vaccine addVaccine(Vaccine vaccine);

    Optional<Vaccine> getVaccineById(Integer id);

    Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
}
