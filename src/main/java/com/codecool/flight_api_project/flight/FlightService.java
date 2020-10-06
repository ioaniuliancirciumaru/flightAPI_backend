package com.codecool.flight_api_project.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService
{
    @Autowired
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository)
    {
        this.flightRepository = flightRepository;
    }


    public void addFlight(FlightModel flightModel)
    {
        flightRepository.insertFlight(flightModel);
    }

    public List<FlightModel> allFlights()
    {
        return flightRepository.selectAllFlights();
    }
}
