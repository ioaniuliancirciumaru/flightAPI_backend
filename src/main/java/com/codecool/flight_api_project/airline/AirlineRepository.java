package com.codecool.flight_api_project.airline;


import com.codecool.flight_api_project.city.CityModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AirlineRepository implements AirlineDao{

    private static List<AirlineModel> DB = new ArrayList<>();


    public void populatedAirlinesList() throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        DB = objectMapper.readValue(
                new File("src/main/resources/airlines.json"),
                new TypeReference<List<AirlineModel>>(){});
    }



    public void insertAirline(AirlineModel airlineModel){
        DB.add(airlineModel);
    }


    @Override
    public List<AirlineModel> selectAllAirline() {
        return DB;
    }
}
