package com.codecool.flight_api_project.airport;
import java.util.ArrayList;
import java.util.List;

public class AirportRepository implements AirportDAO{

    private static final List<AirportModel> DB = new ArrayList<>();

    public AirportRepository() {
    }

    public void insertAirport(AirportModel airport) {
        DB.add(airport);
    }


    @Override
    public List<AirportModel> selectAllAirports() {
        return DB;
    }
}
