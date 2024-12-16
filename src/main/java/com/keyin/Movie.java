package com.keyin;

public class Movie {
    private String title;
    private String genre;
    private String runtime;
    private String director;
    private boolean isRented;

    public Movie (String title, String genre, String runtime, String director) {
        this.title = title;
        this.genre = genre;
        this.runtime = runtime;
        this.director = runtime;
        this.isRented = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getDirector() {
        return director;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Rented
    public boolean isRented() {
        return isRented;
    }

    // Rent Movie
    public void rentMovie() throws Exception {
        if (!isRented) {
            this.isRented = true;
        } else {
            throw new Exception("Movie is already rented");
        }
    }

    // Return Movie
    public void returnMovie() throws Exception {
        if (isRented) {
            this.isRented = false;
        } else {
            throw new Exception("Movie is available to rent");
        }
    }
}