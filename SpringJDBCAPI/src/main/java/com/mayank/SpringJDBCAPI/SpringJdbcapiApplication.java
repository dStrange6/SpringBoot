package com.mayank.SpringJDBCAPI;

import com.mayank.SpringJDBCAPI.dao.Employee;
import com.mayank.SpringJDBCAPI.dao.EmployeeDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcapiApplication {

	public static void main(String[] args)
	{
		ApplicationContext container = SpringApplication.run(SpringJdbcapiApplication.class, args);
		EmployeeDaoImpl repo = container.getBean(EmployeeDaoImpl.class);

		repo.getAllEmployee().forEach(System.out::println);

		System.out.println(container.getClass());

		System.out.println(container.getBeanDefinitionCount());
	}

}
