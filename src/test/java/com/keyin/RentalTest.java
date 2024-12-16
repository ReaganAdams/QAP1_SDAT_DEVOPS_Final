package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RentalTest {
    @Test
    public void testRentalInitialization() throws Exception {
        Movie movie = new Movie("Interstellar","Action","2h 49m", "Christopher Nolan");
        Rental rental = new Rental(movie, 5);

        assertEquals(5, rental.getDaysRented());
        assertEquals(movie, rental.getMovie()); // Initialization the movie rental
    }

    @Test
    public void testMovieIsRentedAfterRentalCreation() throws Exception {
        Movie movie = new Movie("Interstellar","Action","2h 49m", "Christopher Nolan");
        Rental rental = new Rental(movie, 5);

        assertTrue(movie.isRented()); // Movie will be marked as rented
    }
}