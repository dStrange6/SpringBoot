package com.mayank.services.SpringDataJPA02;

import com.mayank.services.SpringDataJPA02.dao.Employee;
import com.mayank.services.SpringDataJPA02.projections.NameAndSalaryOnly;
import com.mayank.services.SpringDataJPA02.service.EmployeeInfo;
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

		EmployeeInfo employeeInfo = container.getBean(EmployeeInfo.class);

		// below code adds employees

//		List<Employee> employees = new ArrayList<>();
//		employees.add(new Employee("Mayank", 23, 5500.45));
//		employees.add(new Employee("Rohan", 22, 4300.43));
//		employees.add(new Employee("Alex", 27, 7000.22));
//
//		employeeInfo.addAllEmployees(employees);

		//projection type is fixed in the repository layer -- static projection
		//employeeInfo.fetchBySalaryGreaterThan(5000d).forEach(v->System.out.println(v.getName()+ " : "+v.getAge()));

		//giving the projection type while calling the method  -- dynamic projection
		employeeInfo.fetchByAgeLessThan(25, NameAndSalaryOnly.class).forEach(v->System.out.println(v.getName() +" : "+v.getSalary()));

	}

}
