package com.codecool.flight_api_project.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

    @Bean
    public int addFlight(FlightModel flightModel)
    {
        return flightRepository.insertFlight(flightModel);
    }

    public List<FlightModel> allFlights()
    {
        return flightRepository.selectAllFlights();
    }
}
