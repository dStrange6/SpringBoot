package com.mayank.SpringDataJPA02;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String vaccineName;

    private double vaccineCost;

    public Vaccine(String vaccineName, double vaccineCost) {
        this.vaccineName = vaccineName;
        this.vaccineCost = vaccineCost;
    }
    public Vaccine(Integer id, String vaccineName, double vaccineCost) {
        this.Id = id;
        this.vaccineName = vaccineName;
        this.vaccineCost = vaccineCost;
    }

    public Vaccine(){}

    @Override
    public String toString() {
        return "Vaccine{" +
                "Id=" + Id +
                ", vaccineName='" + vaccineName + '\'' +
                ", vaccineCost=" + vaccineCost +
                '}';
    }
}
