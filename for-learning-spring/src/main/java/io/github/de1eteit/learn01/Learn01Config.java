package io.github.de1eteit.learn01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("io.github.de1eteit.learn01")
public class Learn01Config {

	@Bean
	public People people(){
		People people = new People();
		people.setName("Alice");
		people.setAge(23);
		return people;
	}

}
