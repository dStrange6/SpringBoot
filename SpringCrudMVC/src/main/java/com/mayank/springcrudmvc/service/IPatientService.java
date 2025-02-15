package com.mayank.springcrudmvc.service;

import com.mayank.springcrudmvc.controller.PatientModel;
import com.mayank.springcrudmvc.dao.Patient;

import java.util.List;

public interface IPatientService
{
    Patient addPatient(PatientModel patientModel);
    List<Patient> getAllPatients();
    Integer getNewId();
}
