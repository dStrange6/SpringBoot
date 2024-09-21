package com.mayank.springboot01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot01Application {

	public Springboot01Application()
	{
		System.out.println("Main class bean created");
	}
	public static void main(String[] args) {

		System.out.println("Inside main method");   

		ApplicationContext container = SpringApplication.run(Springboot01Application.class, args);
		System.out.println(container.getClass().getName()); //AnnotationConfigApplicationContext

		System.out.println("No of beans created behind the scene : "+ container.getBeanDefinitionCount());


		Employee emp = container.getBean(Employee.class);
		emp.setValues();
		emp.printValues();
	}

}
