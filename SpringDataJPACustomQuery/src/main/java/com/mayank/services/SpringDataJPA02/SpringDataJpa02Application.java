package com.mayank.services.SpringDataJPA02;

import com.mayank.services.SpringDataJPA02.dao.Vaccine;
import com.mayank.services.SpringDataJPA02.service.IVaccineInfo;
import com.mayank.services.SpringDataJPA02.service.VaccineInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa02Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa02Application.class, args);

		IVaccineInfo vaccineInfo = container.getBean(VaccineInfo.class);

		vaccineInfo.findVaccineByCostLessThan(400).forEach((System.out::println));

		vaccineInfo.findVaccineCostByName("Forza").forEach((System.out::println));

		System.out.println(vaccineInfo.updateVaccineCostByVaccineName("Covaxin", 1232.99));

	}

}
