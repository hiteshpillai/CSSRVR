package com.capgemini.HiteshCapStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.capgemini.HiteshCapStore.Repository")
@EntityScan("com.capgemini.HiteshCapStore.Enitites")
public class HiteshCapStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiteshCapStoreApplication.class, args);
	}
}
