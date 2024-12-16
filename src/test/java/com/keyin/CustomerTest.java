package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    @Test
    public void testRentMovie() throws Exception {
        Customer customer = new Customer("Reagan Adams", "rkmadams@icloud", "709-123-4444");
        Movie movie = new Movie("Avatar","Action","3h 23m", "James Cameron");

        customer.rentMovie(movie, 5);
        assertEquals(1, customer.getRentals().size());
        assertTrue(movie.isRented()); // Movie is added to customer's rental list
    }

    @Test
    public void testEmptyRentalList() {
        Customer customer = new Customer("Reagan Adams", "rkmadams@icloud", "709-123-4444");

        assertTrue(customer.getRentals().isEmpty()); // No movie rentals in customers list
    }

    @Test
    public void testRentSameMovieTwice() throws Exception {
        Customer customer = new Customer("Reagan Adams", "rkmadams@icloud", "709-123-4444");
        Movie movie = new Movie("Avatar","Action","3h 23m", "James Cameron");

        customer.rentMovie(movie, 5);
        assertThrows(Exception.class, () -> customer.rentMovie(movie, 5)); //  Rent the same movie
    }
}