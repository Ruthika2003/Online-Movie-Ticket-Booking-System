package com.company;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a movie
        Movie movie = new Movie("Movie 1", null);

        // Create showtimes for the movie
        Showtime showtime1 = new Showtime("12:00 PM", null);
        Showtime showtime2 = new Showtime("04:00 PM", null);

        // Create a list of showtimes
        List<Showtime> showtimes = new ArrayList<>();
        showtimes.add(showtime1);
        showtimes.add(showtime2);

        // Set the list of showtimes for the movie
        movie.setShowtimes(showtimes);

        // ... Additional code for seat selection, ticket booking, and ticket cancellation ...
    }
}