package com.example.EVENTTIME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.EVENTTIME.artist"})
public class EventtimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventtimeApplication.class, args);
	}

}
