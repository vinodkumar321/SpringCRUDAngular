package com.jocata.tcl.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.jocata.tcl.dataloader.entity")
@ComponentScan(basePackages = "com.jocata.tcl")
public class TclClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TclClientServiceApplication.class, args);
	}

}
