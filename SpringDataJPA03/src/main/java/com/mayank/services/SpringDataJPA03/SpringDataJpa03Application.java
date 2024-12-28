package com.mayank.services.SpringDataJPA03;

import com.mayank.services.SpringDataJPA03.dao.Vaccine;
import com.mayank.services.SpringDataJPA03.service.IVaccineInfo;
import com.mayank.services.SpringDataJPA03.service.VaccineInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpa03Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa03Application.class, args);

		IVaccineInfo vaccineInfo = container.getBean(VaccineInfo.class);

//		List<Vaccine> vaccineList = new ArrayList<>();
//
//		vaccineList.add(new Vaccine(1,"CoviShiled", 231321.23));
//		vaccineList.add(new Vaccine(2,"Covaxin", 342.21));
//
//		vaccineInfo.deleteAllByVaccineObject(vaccineList);

		System.out.println(vaccineInfo.fetchByName("Sputnik"));

	}

}
