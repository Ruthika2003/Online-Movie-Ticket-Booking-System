
package com.company;

import java.util.List;

public class Showtime {
    private String id;
    private Movie movie;
    private String dateTime;
    private List<Seat> seats;

    public Showtime(String id, Movie movie, String dateTime, List<Seat> seats) {
        this.id = id;
        this.movie = movie;
        this.dateTime = dateTime;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getDateTime() {
        return dateTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setShowtimes(List<Showtime> showtimes) {
        for (Showtime showtime : showtimes) {
            showtime.setShowtimes(showtimes);
        }
    }
}