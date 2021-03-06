package com.codecool.flight_api_project.city;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepository implements CityDAO{

    public CityRepository(){};

    private static List<CityModel> DB = new ArrayList<>();


    public void populatedCitiesList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        DB = objectMapper.readValue(
                new File("src/main/resources/cities.json"),
                new TypeReference<List<CityModel>>(){});
    }


    public void insertCity(CityModel city) {
        DB.add(city);
    }


    @Override
    public List<CityModel> selectAllCities() {
        return DB;
    }
}