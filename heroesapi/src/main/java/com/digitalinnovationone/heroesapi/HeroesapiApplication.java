package com.digitalinnovationone.heroesapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRpositories
public class HeroesapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(HeroesapiApplication.class, args);
		System.out.println("Super poderes com webflux");
	}

}
