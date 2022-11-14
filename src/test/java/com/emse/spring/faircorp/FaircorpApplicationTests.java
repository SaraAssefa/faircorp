package com.emse.spring.faircorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootTest
@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
class FaircorpApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaircorpApplication.class, args);
	}


	@Test
	void contextLoads() {
	}

}

