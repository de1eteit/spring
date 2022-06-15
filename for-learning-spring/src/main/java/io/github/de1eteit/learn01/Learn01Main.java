package io.github.de1eteit.learn01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Learn01Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Learn01Config.class);
		System.out.println(context.getBean("people", People.class));
		System.out.println(context.getBean("pet", Pet.class));
	}

}
