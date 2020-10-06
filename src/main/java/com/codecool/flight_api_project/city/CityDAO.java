package com.codecool.flight_api_project.city;
import com.codecool.flight_api_project.airport.AirportModel;

import java.util.List;

public interface CityDAO {

    List<CityModel> selectAllCities();
}
