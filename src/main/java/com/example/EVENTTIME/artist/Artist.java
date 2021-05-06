package com.example.EVENTTIME.artist;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate datum;
    private LocalDate geburtsdatum;
    private String location;

    public Artist() {}

    public Artist(Long id, String name, LocalDate datum, LocalDate geburtsdatum, String location){
        this.id = id;
        this.name = name;
        this.datum = datum;
        this.geburtsdatum = geburtsdatum;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
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
                ", datum=" + datum +
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
