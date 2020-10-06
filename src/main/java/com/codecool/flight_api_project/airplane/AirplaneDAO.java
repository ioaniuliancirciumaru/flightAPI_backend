package com.codecool.flight_api_project.airplane;
import com.codecool.flight_api_project.airport.AirportModel;

import java.util.List;

public interface AirplaneDAO {

    List<AirplaneModel> selectAllAirplanes();
}
