package com.keyin;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) throws Exception {
        this.movie = movie;
        this.daysRented = daysRented;
        movie.rentMovie();
    }

    // Getters
    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    // Setters
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }
}