package com.mayank.services.SpringDataJPA02;

import com.mayank.services.SpringDataJPA02.dao.UserProfile;
import com.mayank.services.SpringDataJPA02.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpa02Application
{

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa02Application.class, args);

		UserService userService = container.getBean(UserService.class);

//		// --- creating user ---
//		byte[] image = null;
//		char[] resume = null;
//		InputStream stream = null;   //used for image  -- byte[]
//		FileReader reader = null;    //used for resume -- char[]
//
//		stream = new FileInputStream("/Users/pmayank/Downloads/wallhaven-exrqrr.jpg");
//		image = new byte[stream.available()];
//		stream.read(image);
//
//		File file = new File("/Users/pmayank/Downloads/Mayank_Software_Engineer_Resume.pdf");
//		reader = new FileReader(file);
//		resume = new char[(int) file.length()];
//		reader.read(resume);
//
//		UserProfile user1 = new UserProfile("Mayank", 23, image, resume);
//
//		System.out.println(userService.registerUser(user1));

		Optional<UserProfile> optional = userService.getUserById(1);
		if(optional.isPresent())
		{
			UserProfile user = optional.get();
			System.out.println(user.getId() + " --> " + user.getName() + " --> " + user.getAge());

			FileOutputStream stream = new FileOutputStream("image.jpg");
			stream.write(user.getProfileImage());       // write the byte[] array into image.jpg
			stream.flush();

			FileWriter writer = new FileWriter("resume.pdf");
			writer.write(user.getResume());
			writer.flush();
		}
	}

}
