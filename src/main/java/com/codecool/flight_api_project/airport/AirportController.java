package com.codecool.flight_api_project.airport;
import com.codecool.flight_api_project.airport.AirportModel;
import com.codecool.flight_api_project.airport.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/airports")
@CrossOrigin
@Service
public class AirportController {

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
