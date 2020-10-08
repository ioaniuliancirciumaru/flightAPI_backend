package com.codecool.flight_api_project.flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/flights")
@CrossOrigin
public class FlightController
{
    @Autowired
    private FlightService flightService;

    public FlightController(FlightService flightService)
    {
        this.flightService = flightService;
    }

    @GetMapping
    public List<FlightModel> allFlights(){
        return flightService.allFlights();
    }

    @GetMapping("/{from}/{to}")
    public List<FlightModel> getFlights(@PathVariable String from, @PathVariable String to){
        return flightService.searchFlights(from, to);
    }

    @PostMapping
    public void addFLight(@RequestBody FlightModel flightModel)
    {
        flightService.addFlight(flightModel);
    }
}
