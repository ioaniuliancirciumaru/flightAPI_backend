package com.codecool.flight_api_project.airport;
import com.codecool.flight_api_project.airport.AirportModel;

import java.util.List;

public interface AirportDAO {

    List<AirportModel> selectAllAirports();
}
