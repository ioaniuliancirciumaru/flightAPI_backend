package com.codecool.flight_api_project.city;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService{

    @Autowired
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository)
    {
        this.cityRepository = cityRepository;
    }


    public void addCity(CityModel cityModel)
    {
        cityRepository.insertCity(cityModel);
    }

    public  List<CityModel> allCities()
    {
        return cityRepository.selectAllCities();
    }
}
