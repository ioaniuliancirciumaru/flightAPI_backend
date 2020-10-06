package com.codecool.flight_api_project.flight;

import java.util.List;

public interface FlightDAO
{
    List<FlightModel> selectAllFlights();
}
