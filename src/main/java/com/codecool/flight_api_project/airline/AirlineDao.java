package com.codecool.flight_api_project.airline;

import java.util.ArrayList;
import java.util.List;

public interface AirlineDao {

    List<AirlineModel> selectAllAirline();
}

