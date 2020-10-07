package com.codecool.flight_api_project.airline;

import java.util.List;

public class AirlineModel {
    private int id;
    private String name;
    private List<Integer> airplaneId;
    private List<String> airports;


    public AirlineModel(int id, String name, List<Integer> airplaneId, List<String> airports)
    {
        this.id = id;
        this.name = name;
        this.airplaneId = airplaneId;
        this.airports = airports;
    }

    public AirlineModel()
    {
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public List<Integer> getAirplaneId()
    {
        return airplaneId;
    }

    public List<String> getAirports()
    {
        return airports;
    }

    @Override
    public String toString()
    {
        return "AirlineModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", airplaneId=" + airplaneId +
                ", airports=" + airports +
                '}';
    }
}
