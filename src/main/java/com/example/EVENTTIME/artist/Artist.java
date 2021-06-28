package com.example.EVENTTIME.artist;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private String owner;

    public Artist() {}




    public Artist(Long id, String name, String location, String owner){
        this.id = id;
        this.name = name;
        this.location = location;
        this.owner = owner;
    }

    public String getOwner() { return owner; }

    public void setOwner(String owner) { this.owner = owner; }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +

                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
