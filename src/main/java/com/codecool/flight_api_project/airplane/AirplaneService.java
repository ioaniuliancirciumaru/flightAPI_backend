package com.codecool.flight_api_project.airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService{

    @Autowired
    private final AirplaneRepository airplaneRepository;

    public AirplaneService(AirplaneRepository airplaneRepository)
    {
        this.airplaneRepository = airplaneRepository;
    }


    public void addAirplane(AirplaneModel airplaneModel)
    {
        airplaneRepository.insertAirplane(airplaneModel);
    }

    public  List<AirplaneModel> allAirplanes()
    {
        return airplaneRepository.selectAllAirplanes();
    }
}
