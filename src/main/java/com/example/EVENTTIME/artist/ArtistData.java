/*package com.example.EVENTTIME.artist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class ArtistData {

    @Bean
    CommandLineRunner commandLineRunner(ArtistRepository repository){
        return args -> {
            Artist future = new Artist(1L, "Future",
                    "Columbiahalle", "onuril@t-online.de");

            repository.save(future);
        };
    }




}

 */
