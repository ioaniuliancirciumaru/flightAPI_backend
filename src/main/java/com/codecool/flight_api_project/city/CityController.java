package com.codecool.flight_api_project.city;
import com.codecool.flight_api_project.airport.AirportModel;
import com.codecool.flight_api_project.airport.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PreDestroy;
import javax.websocket.server.ServerEndpoint;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
@CrossOrigin
@Service
public class CityController {

    @Autowired
    private final CityService cityService;

    public CityController(CityService cityService)
    {
        this.cityService = cityService;
    }

    @GetMapping
    public List<CityModel> allCities(){
        return cityService.allCities();
    }

    @PostMapping
    public void addCity(@RequestBody CityModel cityModel)
    {
        cityService.addCity(cityModel);
    }
}
