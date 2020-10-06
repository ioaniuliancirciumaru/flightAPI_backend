package com.codecool.flight_api_project.airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService{

    @Autowired
    private final AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository)
    {
        this.airportRepository = airportRepository;
    }


    public void addAirport(AirportModel airportModel)
    {
        airportRepository.insertAirport(airportModel);
    }

    public  List<AirportModel> allAirports()
    {
        return airportRepository.selectAllAirports();
    }
}
