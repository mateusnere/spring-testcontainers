package com.mateusnere.springtestcontainers;

import org.springframework.boot.SpringApplication;

public class TestSpringTestcontainersApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringTestcontainersApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
