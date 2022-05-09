package com.client.client;

import com.client.client.student.Student;
import com.client.client.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(StudentRepository repository){
//		return args -> {
//			Student mariam = new Student(
//					"mariam",
//					"merie@gmail.com",
//					LocalDate.of(2000, Month.JANUARY,5)
//			);
//			Student hamid = new Student(
//					"hamid",
//					"hamid@gmail.com",
//					LocalDate.of(2014, Month.JANUARY,14)
//			);
//
//			repository.saveAll(
//					List.of(hamid,mariam)
//			);
//
//		};
//	}

}
