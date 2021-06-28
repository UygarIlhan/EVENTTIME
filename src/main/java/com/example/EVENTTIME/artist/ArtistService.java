package com.example.EVENTTIME.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;


    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> findAllArtists(String user) {
        var iterator = artistRepository.findAll();
        var favorites = new ArrayList<Artist>();
        for (Artist entity : iterator){
            if (entity.getOwner()!=null && entity.getOwner().equals(user)){
                favorites.add(entity);
            }
        }
        return artistRepository.findAll();
    }

    public Artist save (Artist artist) {return artistRepository.save(artist);}
}