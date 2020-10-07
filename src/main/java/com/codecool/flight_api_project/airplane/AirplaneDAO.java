package com.codecool.flight_api_project.airplane;

import java.util.List;

public interface AirplaneDAO {

    List<AirplaneModel> selectAllAirplanes();
}
