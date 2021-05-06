package com.example.EVENTTIME.artist;

import java.time.LocalDate;

public class Artist {

    private int id;
    private String name;
    private LocalDate datum;
    private LocalDate geburtsdatum;
    private String location;


    public Artist(int id, String name, LocalDate datum, LocalDate geburtsdatum, String location){
        this.id = id;
        this.name = name;
        this.datum = datum;
        this.geburtsdatum = geburtsdatum;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
