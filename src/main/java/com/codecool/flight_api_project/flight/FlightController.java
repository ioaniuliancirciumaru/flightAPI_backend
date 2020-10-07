package com.codecool.flight_api_project.flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    public void addFLight(@RequestBody FlightModel flightModel)
    {
        flightService.addFlight(flightModel);
    }
}
