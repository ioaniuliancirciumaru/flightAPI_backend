package com.codecool.flight_api_project.flight;

import com.codecool.flight_api_project.airplane.AirplaneRepository;
import com.codecool.flight_api_project.city.CityModel;
import com.codecool.flight_api_project.city.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService
{

    @Autowired
    private final FlightRepository flightRepository;
    CityRepository cityRepository = new CityRepository();


    public FlightService(FlightRepository flightRepository)
    {
        this.flightRepository = flightRepository;
    }

    public List<FlightModel> searchFlights(String departureCity, String arrivalCity)
    {
        List<FlightModel> result = new ArrayList<>();

        for (CityModel _tempFromCity : cityRepository.selectAllCities())
        {
            if (_tempFromCity.getCityName().equals(departureCity))
            {
                for (CityModel _tempToCity : cityRepository.selectAllCities())
                {
                    if (_tempToCity.getCityName().equals(arrivalCity))
                    {

                        result.add(new FlightModel(departureCity, arrivalCity));
                    }
                }
            }
        }
        System.out.println(cityRepository.toString());
        return result;
    }

    public void addFlight(FlightModel flightModel)
    {
        flightRepository.insertFlight(flightModel);
    }

    public List<FlightModel> allFlights()
    {
        return flightRepository.selectAllFlights();
    }
}
