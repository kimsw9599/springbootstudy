package com.sunsw.dbquerier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.sunsw.dbquerier.dao")
@EntityScan("com.sunsw.dbquerier.model")
@SpringBootApplication
public class DbquerierApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbquerierApplication.class, args);
	}
}
