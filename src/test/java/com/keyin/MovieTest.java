package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {
    @Test
    public void testRentMovie() throws Exception {
        Movie movie = new Movie("Avatar", "Action", "3h 23m", "James Cameron");
        movie.rentMovie();
        assertTrue(movie.isRented()); // Movie is marked as rented
    }

    @Test
    public void testReturnMovie() throws Exception {
        Movie movie = new Movie("Avatar", "Action", "3h 23m", "James Cameron");
        movie.rentMovie();
        movie.returnMovie();
        assertFalse(movie.isRented()); // Shows that movie is no longer rented
    }

    @Test
    public void testRentMovieException() throws Exception {
        Movie movie = new Movie("Avatar", "Action", "3h 23m", "James Cameron");
        movie.rentMovie();
        assertThrows(Exception.class, movie::rentMovie); // Rent a movie already rented
    }
}