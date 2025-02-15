package com.mayank.springcrudmvc.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PatientModel
{
    private String name;
    private Integer age;
    private String gender;
}
