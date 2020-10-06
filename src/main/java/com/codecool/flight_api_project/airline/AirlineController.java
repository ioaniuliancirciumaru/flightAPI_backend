package com.codecool.flight_api_project.airline;


import com.codecool.flight_api_project.airport.AirportModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/airlines")
@CrossOrigin
public class AirlineController {

    @Autowired
    private final AirlineService airlineService ;

    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }


    @GetMapping
    public List<AirlineModel> allAirline(){
        return airlineService.allAirlines();
    }

    @PostMapping
    public void addAirline(AirlineModel airlineModel){
        airlineService.addAirline(airlineModel);
    }

}
