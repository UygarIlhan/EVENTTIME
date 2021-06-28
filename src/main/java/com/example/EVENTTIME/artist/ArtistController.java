/*package com.example.EVENTTIME.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/future")
public class ArtistController {


    Artist artist = new Artist(1L, "Future", LocalDate.of(2021, 10, 1),
            LocalDate.of(1983, 11, 20), "Columbiahalle");



    //private final ArtistService artistService;

    //@Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

  /*  @GetMapping
    public List<Artist> getArtist(){
        return artistService.getArtist();
    }



}

   */
