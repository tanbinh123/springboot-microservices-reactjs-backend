package com.thisisaloksingh.spapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

//@ComponentScan({"com.thisisaloksingh.spapps.controller"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SbootsappsApplication {

	public static void main(String[] args) {
		System.out.println("SbootsappsApplication.main()");
		SpringApplication.run(SbootsappsApplication.class, args);
	}

}
