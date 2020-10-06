package com.codecool.flight_api_project.city;

import com.codecool.flight_api_project.airport.AirportModel;

import java.util.ArrayList;
import java.util.List;

public class CityModel {

    private String name;
    private List<AirportModel> airports;

    public CityModel(String name) {
        this.name = name;
        this.airports = new ArrayList<AirportModel>();

    }

    public CityModel() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CityModel{" +
                "name='" + name + '\'' +
                ", airports=" + airports +
                '}';
    }

    public List<AirportModel> getAirports() {
        return airports;
    }
}
