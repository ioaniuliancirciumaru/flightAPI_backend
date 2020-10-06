package com.codecool.flight_api_project.airport;

import com.codecool.flight_api_project.airport.AirportModel;
import com.codecool.flight_api_project.airport.AirportService;
import com.codecool.flight_api_project.flight.FlightModel;
import com.codecool.flight_api_project.flight.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/airports")
@CrossOrigin
public class AirportController
{
    @Autowired
    private final AirportService airportService;

    public AirportController(AirportService airportService)
    {
        this.airportService = airportService;
    }

    @GetMapping
    public List<AirportModel> allFlights(){
        return airportService.allAirports();
    }

    @PostMapping
    public void addAirport(@RequestBody AirportModel airportModel)
    {
        airportService.addAirport(airportModel);
    }
}
