package com.crudtesting.demoapi;

import com.crudtesting.demoapi.dao.StudentDAO;
import com.crudtesting.demoapi.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoapiApplication.class, args);
	}

	@Bean
	public CommandLineRunner CommandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent1 = new Student("paul", "walker","paulwalker@java.com" );
		Student tempStudent2 = new Student("jan", "doe","jandoe@java.com" );
		Student tempStudent3 = new Student("Ben", "affleck","Benaffleck@java.com" );
		Student tempStudent4 = new Student("kristen", "stewart","kristenstewart@java.com" );
		Student tempStudent5 = new Student("Robert", "pattinson","Robertpattinson@java.com" );

		// save the student object
		System.out.println("Saving new student object...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);
		studentDAO.save(tempStudent5);

		// display id of the saved student
		System.out.println("Saving new student object...");
		System.out.println("Saved Student. Generated id: "+tempStudent1.getId());
		System.out.println("Saved Student. Generated id: "+tempStudent2.getId());
		System.out.println("Saved Student. Generated id: "+tempStudent3.getId());
		System.out.println("Saved Student. Generated id: "+tempStudent4.getId());
		System.out.println("Saved Student. Generated id: "+tempStudent5.getId());

	}
}
