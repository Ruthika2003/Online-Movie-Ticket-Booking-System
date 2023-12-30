package com.company;

public class Ticket {
    private String bookingId;
    private String movieTitle;
    private String showtime;
    private String seatNumber;

    public Ticket(String bookingId, String movieTitle, String showtime, String seatNumber) {
        this.bookingId = bookingId;
        this.movieTitle = movieTitle;
        this.showtime = showtime;
        this.seatNumber = seatNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getShowtime() {
        return showtime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}
