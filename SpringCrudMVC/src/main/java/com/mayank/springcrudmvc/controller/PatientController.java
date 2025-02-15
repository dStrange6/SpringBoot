package com.mayank.springcrudmvc.controller;

import com.mayank.springcrudmvc.dao.Patient;
import com.mayank.springcrudmvc.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class PatientController
{

    private final IPatientService patientService;

    @Autowired
    public PatientController(IPatientService patientService)
    {
        this.patientService = patientService;
    }

    @GetMapping("/home")
    public String homePage(Map<String, Object> model)
    {
        List<Patient> patients = patientService.getAllPatients();
        model.put("patients", patients);
        return "home";
    }

    @GetMapping("/register")
    public String registerPatient(Map<String, Object> model)
    {
        Integer newID = patientService.getNewId();
        model.put("newID", newID);
        return "register";
    }

    @PostMapping("/register")
    public ModelAndView registerPatient(@ModelAttribute PatientModel patientModel)
    {
        Patient patient=patientService.addPatient(patientModel);
        System.out.println("Patient Registered Successfully : " + patient);
        return new ModelAndView("redirect:/home");   //redirecting to home controller
    }
}
