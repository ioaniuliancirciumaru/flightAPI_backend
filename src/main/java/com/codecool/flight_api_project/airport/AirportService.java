package com.codecool.flight_api_project.airport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        return AirportRepository.selectAllAirports();
    }
}
