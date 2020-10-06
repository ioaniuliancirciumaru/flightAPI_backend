package com.codecool.flight_api_project.flight;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepository implements FlightDAO
{
    private static final List<FlightModel> DB = new ArrayList<>();

    public FlightRepository() {
    }

    public void insertFlight(FlightModel flight) {
        DB.add(flight);
    }

    @Override
    public List<FlightModel> selectAllFlights()
    {
        return DB;
    }
}
