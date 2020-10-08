package com.codecool.flight_api_project.flight;

import com.codecool.flight_api_project.airline.AirlineModel;
import com.codecool.flight_api_project.airplane.AirplaneModel;

import com.codecool.flight_api_project.city.CityModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class FlightModel
{


    private CityModel departureAirport;
    private CityModel arrivalAirport;
    private LocalDate date;
    private List<AirlineModel> airlineModels = new ArrayList<>();



    public FlightModel(
            CityModel departureAirport,
            CityModel arrivalAirport,
            LocalDate date,
            List<AirlineModel> airlineModels ) {

        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.date = date;
        this.airlineModels = airlineModels;

    }

    public FlightModel()
    {
    }


    public List<AirlineModel> getAirlineModels() {
        return airlineModels;
    }


    public CityModel getDepartureAirport()
    {
        return departureAirport;
    }

    public CityModel getArrivalAirport()
    {
        return arrivalAirport;
    }


    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FlightModel{");
        sb.append("departureAirport=").append(departureAirport);
        sb.append(", arrivalAirport=").append(arrivalAirport);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();

    }
}
