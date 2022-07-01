package com.zip.zippractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ZipPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipPracticeApplication.class, args);
	}

}
