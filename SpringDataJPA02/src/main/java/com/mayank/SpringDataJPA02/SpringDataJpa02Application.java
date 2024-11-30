package com.mayank.SpringDataJPA02;

import com.mayank.SpringDataJPA02.service.IVaccineInfo;
import com.mayank.SpringDataJPA02.service.VaccineInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpa02Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa02Application.class, args);

		IVaccineInfo vaccineInfo = container.getBean(VaccineInfo.class);

		Vaccine v1 = vaccineInfo.addVaccine(new Vaccine("CoviShiled", 231321.23));

		System.out.println(v1);
		Vaccine v2 = vaccineInfo.addVaccine(new Vaccine("Covaxin", 342.21));
		System.out.println(v2);
		Optional<Vaccine> v3 = vaccineInfo.getVaccineById(2);
		System.out.println(v3.get());
	}

}
