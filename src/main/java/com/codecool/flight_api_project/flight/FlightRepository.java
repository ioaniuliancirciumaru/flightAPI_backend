package com.codecool.flight_api_project.flight;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepository implements FlightDAO
{
    private static final List<FlightModel> DB = new ArrayList<>();

    public int insertFlight(FlightModel flight) {
        DB.add(flight);
        return 1;
    }

    @Override
    public List<FlightModel> selectAllFlights()
    {
        return DB;
    }
}
