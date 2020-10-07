package com.codecool.flight_api_project.airport;

import com.codecool.flight_api_project.flight.FlightModel;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String airportIataCode;
    private String airportName;


    public Airport(String airportIataCode, String airportName) {
        this.airportIataCode = airportIataCode;
        this.airportName = airportName;
    }

    public Airport() {
    }

    public String getAirportIataCode() {
        return airportIataCode;
    }

    public String getAirportName() {
        return airportName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AirportModel{");
        sb.append("airportIataCode='").append(airportIataCode).append('\'');
        sb.append(", airportName='").append(airportName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
