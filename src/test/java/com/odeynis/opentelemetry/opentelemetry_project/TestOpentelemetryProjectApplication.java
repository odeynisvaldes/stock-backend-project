package com.odeynis.opentelemetry.opentelemetry_project;

import org.springframework.boot.SpringApplication;

public class TestOpentelemetryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(OpentelemetryProjectApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
