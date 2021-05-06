package com.example.EVENTTIME.artist;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ArtistService {

    public List<Artist> getArtist(){
        return List.of(new Artist(1, "Future", LocalDate.of(2021, 10, 01),
                LocalDate.of(1983, 11, 20), "Columbiahalle"));
    }
}
