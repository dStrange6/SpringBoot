package com.mayank.springcrudmvc.service;

import com.mayank.springcrudmvc.controller.PatientModel;
import com.mayank.springcrudmvc.dao.IPatientPersistance;
import com.mayank.springcrudmvc.dao.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements IPatientService
{
    private final IPatientPersistance dao;

    @Autowired
    public PatientService(IPatientPersistance dao)
    {
        this.dao = dao;
    }

    @Override
    public Patient addPatient(PatientModel patientModel)
    {
        Patient patient = new Patient();
        patient.setName(patientModel.getName());
        patient.setGender(patientModel.getGender());
        patient.setAge(patientModel.getAge());
        return dao.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return dao.findAll();
    }

    @Override
    public Integer getNewId() {
        return dao.findAll().get((int) (dao.count()-1)).getId()+1;
    }

    @Override
    public void deletePatient(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Patient getPatientById(Integer id) {
        Optional<Patient> patient = dao.findById(id);
        return patient.orElse(null);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        System.out.println(patient);
        return dao.save(patient);
    }
}
