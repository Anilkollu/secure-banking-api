package com.banking.securebankingapi;

import com.banking.securebankingapi.model.Role;
import com.banking.securebankingapi.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurebankingapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurebankingapiApplication.class, args);
	}

	@Bean
	CommandLineRunner initRoles(RoleRepository roleRepo) {
		return args -> {
			if (roleRepo.findByName("ROLE_USER").isEmpty()) {
				roleRepo.save(new Role(null, "ROLE_USER"));
			}
			if (roleRepo.findByName("ROLE_ADMIN").isEmpty()) {
				roleRepo.save(new Role(null, "ROLE_ADMIN"));
			}
		};
	}
}
