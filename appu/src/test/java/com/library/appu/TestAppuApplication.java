package com.library.appu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestAppuApplication {

	public static void main(String[] args) {
		SpringApplication.from(AppuApplication::main).with(TestAppuApplication.class).run(args);
	}

}
