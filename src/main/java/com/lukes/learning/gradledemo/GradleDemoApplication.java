package com.lukes.learning.gradledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class GradleDemoApplication {

	public static void main(String[] args) {

		System.out.println("System properties----------------------------");
		Properties properties = System.getProperties();
		System.out.println(properties.size());
		properties.forEach((p, v) -> {
			if (p.toString().startsWith("property")) {
				System.out.println(p + ": " + v);
			}
		});

		System.out.println("Environment variables---------------------------");
		String e = "JAVA_HOME";
		String v = System.getenv(e);
		System.out.println(e + ": " + v);

		SpringApplication.run(GradleDemoApplication.class, args);
	}

}
