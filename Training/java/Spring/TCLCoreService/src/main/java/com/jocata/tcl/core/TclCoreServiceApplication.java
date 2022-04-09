package com.jocata.tcl.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.jocata.tcl.dataloader.entity")
@ComponentScan(basePackages = "com.jocata.tcl")
public class TclCoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TclCoreServiceApplication.class, args);
	}

}
