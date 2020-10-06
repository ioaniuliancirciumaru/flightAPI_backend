package com.codecool.flight_api_project.city;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepository implements CityDAO{

    private static final List<CityModel> DB = new ArrayList<>();

    public CityRepository() {
    }

    public void insertCity(CityModel city) {
        DB.add(city);
    }


    @Override
    public List<CityModel> selectAllCities() {
        return DB;
    }
}