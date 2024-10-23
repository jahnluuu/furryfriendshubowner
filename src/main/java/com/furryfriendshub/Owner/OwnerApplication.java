package com.furryfriendshub.Owner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.furryfriendshub")
@EnableJpaRepositories(basePackages = "com.furryfriendshub.OwnerRepository")
@EntityScan(basePackages = "com.furryfriendshub.OwnerEntity")
public class OwnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnerApplication.class, args);
	}

}
