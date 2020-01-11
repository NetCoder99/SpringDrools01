package com.home.SpringDrools01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.home.SpringDrools01.repositories"})
public class AppMain {

	public static void main(String[] args) {
		try {
			System.out.println("------ SpringDrools01 Started ------");

			SpringApplication.run(AppMain.class, args);

			System.out.println("------ SpringDrools01 Finished ------");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("------ SpringDrools01 Failed ------");
		}

	}

}
