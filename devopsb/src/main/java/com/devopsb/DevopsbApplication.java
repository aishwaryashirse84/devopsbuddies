package com.devopsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"com.devopsb"})
@EnableWebMvc
public class DevopsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsbApplication.class, args);
	}

}
