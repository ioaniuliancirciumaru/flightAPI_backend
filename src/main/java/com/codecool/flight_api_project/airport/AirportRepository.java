package com.codecool.flight_api_project.airport;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AirportRepository {


    private static List<Airport> DB = new ArrayList<>();


    public void populatedAirportsList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        DB = objectMapper.readValue(
                new File("src/main/resources/airports.json"),
                new TypeReference<List<Airport>>(){});
    }

    public void insertAirport(Airport airport) {
        DB.add(airport);
    }


    public List<Airport> selectAllAirports() {
        return DB;
    }
}
