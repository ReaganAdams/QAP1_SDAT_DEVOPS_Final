package com.keyin;

public class RentalSystem {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Reagan Adams", "rkmadams@icloud", "709-123-4444");
        Movie movie1 = new Movie("Avatar", "Action", "3h 23", "James Cameron");
        Movie movie2 = new Movie("Interstellar","Action","2h 49m", "Christopher Nolan");

        customer.rentMovie(movie1,5);
        customer.rentMovie(movie2,3);

        for (Rental rental : customer.getRentals()) {
            System.out.println("Movie: " + rental.getMovie().getTitle() + "\n"
                    + "Days Rented: " + rental.getDaysRented() + "\n"
                    + "Customer: " + "\n"
                    + " Name: " + customer.getName() + "\n"
                    + " Email: " + customer.getEmail() + "\n"
                    + " Phone Number: " + customer.getPhoneNum() + "\n"
            );
        }
    }
}