package com.codecool.flight_api_project.airport;

import com.codecool.flight_api_project.flight.FlightModel;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String airportIataCode;
    private String airportName;
    private List<Integer> airlinesID;


    public Airport(String airportIataCode, String airportName, List<Integer> airlinesID) {
        this.airportIataCode = airportIataCode;
        this.airportName = airportName;
        this.airlinesID = airlinesID;
    }

    public Airport() {
    }

    public String getAirportIataCode() {
        return airportIataCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public List<Integer> getAirlinesID() {
        return airlinesID;
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
