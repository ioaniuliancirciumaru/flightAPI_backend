package com.codecool.flight_api_project.airline;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {

    @Autowired
    private final AirlineRepository airlineRepository;

    public AirlineService(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    public void addAirline(AirlineModel airlineModel) {
        airlineRepository.insertAirline(airlineModel);
    }

    public List<AirlineModel> allAirlines(){
        return airlineRepository.selectAllAirline();
    }
}
