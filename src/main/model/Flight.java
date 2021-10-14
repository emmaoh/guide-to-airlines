package model;

import java.time.LocalDate;

// Represents a flight with a given flight number, destination, duration, date, cost, price range and seats available
public class Flight {
    private String name;           // name of specific flight (plane)
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
    public Flight(String name, String flightNum, String destination, double duration,
                  LocalDate date, String time, int maxSeats) {
        this.name = name;
        this.flightNum = flightNum;
        this.destination = destination;
        this.duration = duration;
        this.date = date;
        this.time = time;
        this.maxSeats = maxSeats;
        airport = "YVR";
    }

    // EFFECTS: returns name of plane
    public String getName() {
        return name;
    }

    // EFFECTS: returns flight number
    public String getFlightNum() {
        return flightNum;
    }

    // EFFECTS: returns destination of flight
    public String getDestination() {
        return destination;
    }











}
