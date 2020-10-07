package com.codecool.flight_api_project.city;

import com.codecool.flight_api_project.airport.AirportModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CityModel {

    private UUID id;
    private String name;
    private List<AirportModel> airports = new ArrayList<>();
    private String country;

    public CityModel(String name, List<AirportModel> airports, String country)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.airports = airports;
        this.country = country;
    }

    public CityModel() {
    }

    public UUID getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public List<AirportModel> getAirports()
    {
        return airports;
    }

    public String getCountry()
    {
        return country;
    }

    public void addAirport(AirportModel airport)
    {
        this.airports.add(airport);
        System.out.println("Airport: " + airport + " added to airports list");
    }


    @Override
    public String toString()
    {
        return "CityModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", airports=" + airports +
                ", country='" + country + '\'' +
                '}';
    }
}
