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

<<<<<<< HEAD
    public int addFlight(FlightModel flightModel)
=======

    public void addFlight(FlightModel flightModel)
>>>>>>> 22fbf788c09a4d635fdc251880ccab1f11a639a3
    {
        flightRepository.insertFlight(flightModel);
    }

    public List<FlightModel> allFlights()
    {
        return flightRepository.selectAllFlights();
    }
}
