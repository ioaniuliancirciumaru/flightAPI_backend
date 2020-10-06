package com.codecool.flight_api_project.airport;

import com.codecool.flight_api_project.flight.FlightModel;

import java.util.ArrayList;
import java.util.List;

public class AirportModel {

    public String name;
    public String iataCode;
    public String city;
    public List<FlightModel> flights =  new ArrayList<>();


    public AirportModel(String name, String iataCode, String city, List<FlightModel> flights) {
        this.name = name;
        this.iataCode = iataCode;
        this.city = city;
        this.flights = flights;
    }

    public AirportModel() {
    }

    public String getName() {
        return name;
    }

    public String getIataCode() {
        return iataCode;
    }

    public String getCity() {
        return city;
    }

    public List<FlightModel> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AirportModel{");
        sb.append("name='").append(name).append('\'');
        sb.append(", iataCode='").append(iataCode).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", flights=").append(flights);
        sb.append('}');
        return sb.toString();
    }
}
