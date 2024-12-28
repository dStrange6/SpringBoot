package com.mayank.SpringDataJPA02;

import com.mayank.SpringDataJPA02.service.IVaccineInfo;
import com.mayank.SpringDataJPA02.service.VaccineInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpa02Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa02Application.class, args);

		IVaccineInfo vaccineInfo = container.getBean(VaccineInfo.class);

//		Vaccine v1 = vaccineInfo.addVaccine(new Vaccine("CoviShiled", 231321.23));
//
//		System.out.println(v1);
//		Vaccine v2 = vaccineInfo.addVaccine(new Vaccine("Covaxin", 342.21));
//		System.out.println(v2);
//		Optional<Vaccine> v3 = vaccineInfo.getVaccineById(2);
//		System.out.println(v3.get());

		Vaccine v1 = new Vaccine("CoviShield", 231321.23);
		Vaccine v2 = new Vaccine("Covaxin", 342.21);

		//List<Vaccine> vaccineList = new ArrayList<Vaccine>();  //after java 7 no need to specify generic type on both side
		List<Vaccine> vaccineList = new ArrayList<>();

		vaccineList.add(v1);
		vaccineList.add(v2);
		vaccineList.add(new Vaccine("Forxa", 41312.2));
		vaccineList.add(new Vaccine("Sputnik", 342.22));

		//vaccineInfo.registerMultipleVaccines(vaccineList).forEach(v->System.out.println(v));   //can also be written in below format
		vaccineInfo.registerMultipleVaccines(vaccineList).forEach(System.out::println);

	}

}
