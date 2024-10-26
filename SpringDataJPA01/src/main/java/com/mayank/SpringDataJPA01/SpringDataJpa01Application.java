package com.mayank.SpringDataJPA01;

import com.mayank.SpringDataJPA01.DAO.Employee;
import com.mayank.SpringDataJPA01.DAO.IStudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpa01Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa01Application.class, args);

		IStudentRepo repo = container.getBean(IStudentRepo.class);

		System.out.println(repo.getClass());

		Employee res = repo.save(new Employee(3, "Alex", "MAD", 3500.32));

		System.out.println(res);
	}

}
