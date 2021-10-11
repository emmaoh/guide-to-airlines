package model;

import java.time.LocalDate;

// Represents a flight with a given flight number, destination, duration, date, cost, price range and seats available
public class Flight {
    private String flightNum;      // the plane number in 6 digits
    private String destination;    // arrival destination of flight
    private double duration;          // hours taken to arrival
    private LocalDate date;              // date of departure: mmddyyyy
    private String time;              // time of departure: 24-hour time
    private String airport;        // name of airport for departure

    private int cost;              // cost of one-way trip in $CAD
    private String priceRange;     // indication of HIGH, GOOD or LOW in comparison to other flights
    private int maxSeats;          // max number of passenger seats for flight

    // REQUIRES: flightNum ...
    // EFFECTS: flight has given flight number, destination, duration and date
    public Flight(String flightNum, String destination, double duration, LocalDate date, String time) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.duration = duration;
        this.date = date;
        this.time = time;
        airport = "YVR";
    }

    // EFFECTS: returns flight number
    public int getFlightNum() {
        return 0;
    }

    // EFFECTS: returns destination of flight
    public String getDestination() {
        return "";
    }

    // EFFECTS: returns duration of flight
    public int getDuration() {
        return 0;
    }

    // EFFECTS: returns date of departure
    public int getDate() {
        return 0;
    }

    // EFFECTS: returns cost of flight one-way
    public int getCost() {
        return 0;
    }

    // EFFECTS: returns price range of flight (HIGH, GOOD, LOW) depending on season;
    public String getPriceRange() {
        return "";
    }

    // EFFECTS: returns max seat capacity on flight
    public int getMaxSeats() {
        return 0;
    }




}
