package com.codecool.flight_api_project.airplane;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AirplaneRepository implements AirplaneDAO{

    private static final List<AirplaneModel> DB = new ArrayList<>();

    public AirplaneRepository() {
    }

    public void insertAirplane(AirplaneModel airplane) {
        DB.add(airplane);
    }

    @Override
    public List<AirplaneModel> selectAllAirplanes() {
        return DB;
    }
}
