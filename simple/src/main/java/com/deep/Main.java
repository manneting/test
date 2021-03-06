package com.deep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
