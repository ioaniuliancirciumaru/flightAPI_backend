package com.codecool.flight_api_project.flight;
import com.codecool.flight_api_project.airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/flights")
@CrossOrigin
public class FlightController
{
    @Autowired
    private final FlightService flightService;

    public FlightController(FlightService flightService)
    {
        this.flightService = flightService;
    }

    @GetMapping
    public List<FlightModel> allFlights(){
        return flightService.allFlights();
    }

    @GetMapping("{from}/{to}/{date}")
    public List<FlightModel> allFlights(@PathVariable String from, @PathVariable String to, @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){
        return flightService.searchFlight(from, to, date);
    }

    @PostMapping
    public void addFLight(@RequestBody FlightModel flightModel)
    {
        flightService.addFlight(flightModel);
    }
}
