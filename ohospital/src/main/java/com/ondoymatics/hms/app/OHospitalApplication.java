package com.ondoymatics.hms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class OHospitalApplication extends SpringBootServletInitializer {

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OHospitalApplication.class);
	}

	public static void main(String args[]) throws Exception {
		SpringApplication.run(OHospitalApplication.class, args);
	}
}
