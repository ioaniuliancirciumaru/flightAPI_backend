package com.codecool.flight_api_project.airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/airports")
@CrossOrigin
public class AirportController {

    @Autowired
    private final AirportService airportService;

    public AirportController(AirportService airportService)
    {
        this.airportService = airportService;
    }

    @GetMapping
    public List<Airport> allFlights(){
        return airportService.allAirports();
    }

//    @PostMapping
//    public void addAirport(@RequestBody Airport airportModel)
//    {
//        airportService.addAirport(airportModel);
//    }
}
