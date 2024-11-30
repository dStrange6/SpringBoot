package com.mayank.SpringDataJPA01;

import com.mayank.SpringDataJPA01.DAO.Employee;
import com.mayank.SpringDataJPA01.DAO.IEmployeeRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpa01Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa01Application.class, args);

		IEmployeeRepo repo = container.getBean(IEmployeeRepo.class);

		System.out.println(repo.getClass());

		//Employee res = repo.save(new Employee( "Alex", "MAD", 3500.32));
		repo.delete(repo.getReferenceById(2));
		//System.out.println(res);
	}

}
