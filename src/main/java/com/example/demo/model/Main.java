package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String artist;
    private String genre;
    private int year;
    private double lasting;
    public Main() {
    }

    public Main(String name, String artist, String genre, int year, double lasting) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.lasting = lasting;

    }

    public Long getId() {
        return id;
    }

    public double getLasting() {
        return lasting;
    }

    public void setLasting(double lasting) {
        this.lasting = lasting;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
