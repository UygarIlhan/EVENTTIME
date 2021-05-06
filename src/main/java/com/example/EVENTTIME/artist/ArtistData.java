package com.example.EVENTTIME.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class ArtistData {

    @Bean
    CommandLineRunner commandLineRunner(ArtistRepository repository){
        return args -> {
            Artist future = new Artist(1L, "Future", LocalDate.of(2021, 10, 1),
                    LocalDate.of(1983, 11, 20), "Columbiahalle");

            repository.save(future);
        };
    }




}
