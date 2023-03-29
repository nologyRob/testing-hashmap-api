package com.testing.hashmaps;


import javax.persistence.*;
import java.time.LocalDate;


public class Album {
    private String name;
    private String genre;
    private double rating;
    private String cover;
    private int peakChartPosition;
    private int numOfSongs;
    private LocalDate dateReleased;

    public Album() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPeakChartPosition() {
        return peakChartPosition;
    }

    public void setPeakChartPosition(int peakChartPosition) {
        this.peakChartPosition = peakChartPosition;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public LocalDate getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(LocalDate dateReleased) {
        this.dateReleased = dateReleased;
    }

    public Album(String name, String genre, double rating, String cover, int peakChartPosition, int numOfSongs, LocalDate dateReleased) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.cover = cover;
        this.peakChartPosition = peakChartPosition;
        this.numOfSongs = numOfSongs;
        this.dateReleased = dateReleased;
    }
}
