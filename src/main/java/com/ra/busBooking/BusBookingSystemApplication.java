package com.ra.busBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class BusBookingSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(BusBookingSystemApplication.class, args);
	}

}
