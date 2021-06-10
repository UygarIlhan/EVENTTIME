package com.example.EVENTTIME;

import com.example.EVENTTIME.artist.Artist;
import com.example.EVENTTIME.persistency.UserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackageClasses={UserEntity.class, Artist.class})
public class EventtimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventtimeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
