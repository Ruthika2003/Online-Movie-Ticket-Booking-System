
package com.company;

public class Seat {
    private String id;
    private String row;
    private int number;
    private boolean isBooked;

    public Seat(String id, String row, int number, boolean isBooked) {
        this.id = id;
        this.row = row;
        this.number = number;
        this.isBooked = isBooked;
    }

    public String getId() {
        return id;
    }

    public String getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public boolean isBooked() {
        return isBooked;
    }
}
