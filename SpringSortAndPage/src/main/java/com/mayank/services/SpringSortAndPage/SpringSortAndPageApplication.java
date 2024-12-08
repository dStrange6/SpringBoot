package com.mayank.services.SpringSortAndPage;

import com.mayank.services.SpringSortAndPage.dao.Vaccine;
import com.mayank.services.SpringSortAndPage.service.IVaccineInfo;
import com.mayank.services.SpringSortAndPage.service.VaccineInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringSortAndPageApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringSortAndPageApplication.class, args);

		VaccineInfo vaccineInfo = container.getBean(VaccineInfo.class);

		//vaccineInfo.getSortedVaccines(true, "vaccineCost", "vaccineName", "Id").forEach(c->System.out.println(c.getVaccineCost() +" -> "+c.getVaccineName()+" -> "+c.getId()));
		vaccineInfo.getPageableVaccines(2,true,"Id");
	}

}
