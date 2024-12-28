package com.mayank.services.SpringDataJPA03.service;

import com.mayank.services.SpringDataJPA03.dao.Vaccine;

public interface IVaccineInfo
{
    void deleteAllByVaccineObject(Iterable<Vaccine> vaccines);
    Vaccine fetchByName(String vaccineName);
}
