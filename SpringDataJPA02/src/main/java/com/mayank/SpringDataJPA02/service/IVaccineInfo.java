package com.mayank.SpringDataJPA02.service;

import com.mayank.SpringDataJPA02.Vaccine;

import java.util.Optional;

public interface IVaccineInfo
{
    Vaccine addVaccine(Vaccine vaccine);

    Optional<Vaccine> getVaccineById(Integer id);
}
