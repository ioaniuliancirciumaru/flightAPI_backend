package com.codecool.flight_api_project.airline;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AirlineRepository implements AirlineDao{

    private static final List<AirlineModel> DB = new ArrayList<>();

    public AirlineRepository() {
    }

    public void insertAirline(AirlineModel airlineModel){
        DB.add(airlineModel);
    }


    @Override
    public List<AirlineModel> selectAllAirline() {
        return DB;
    }
}
