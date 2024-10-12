package com.mayank.SpringDataJDBC;

import com.mayank.SpringDataJDBC.dao.SpringDao;
import com.mayank.SpringDataJDBC.dao.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public SpringDataJdbcApplication()
	{
		System.out.println("Main class bean created .....");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method ...");
		SpringApplication.run(SpringDataJdbcApplication.class, args);
		System.out.println("After run method in main ......");

//		SpringDao dao = context.getBean(SpringDao.class);
//
//		dao.insert(new Student(1,"Mayank","IT"));
//		dao.insert(new Student(2,"Manish","CS"));

	}

}
