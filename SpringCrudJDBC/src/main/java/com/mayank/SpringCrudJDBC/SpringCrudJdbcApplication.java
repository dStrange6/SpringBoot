package com.mayank.SpringCrudJDBC;

import com.mayank.SpringCrudJDBC.dao.Employee;
import com.mayank.SpringCrudJDBC.dao.EmployeeDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringCrudJdbcApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringCrudJdbcApplication.class, args);
		EmployeeDaoImpl repo = context.getBean(EmployeeDaoImpl.class);
//		Employee employee = new Employee();
//		employee.setId(5);
//		employee.setName("Rocky");
//		employee.setSalary(213231.22);
//		employee.setCity("MAD");
//		repo.addEmployee(employee);
//
//		repo.getAllEmployee().forEach(System.out::println);
//		repo.deleteEmployee(5);
//		repo.getAllEmployee().forEach(System.out::println);

		System.out.println(repo.getEmployee(2));


	}

}
