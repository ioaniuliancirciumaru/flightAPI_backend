package com.codecool.flight_api_project.city;

import com.codecool.flight_api_project.airport.AirportModel;

import java.util.ArrayList;
import java.util.List;

public class CityModel {

    private final String cityIataCode;
    private final String countryIsoCode;
    private final String name;
    private List<String> airportsId = new ArrayList<>();

    public CityModel(String cityIataCode, String countryIsoCode, String name, List<String> airportsId) {
        this.cityIataCode = cityIataCode;
        this.countryIsoCode = countryIsoCode;
        this.name = name;
        this.airportsId = airportsId;
    }

    public String getCityIataCode() {
        return cityIataCode;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public String getName() {
        return name;
    }

    public List<String> getAirportsId() {
        return airportsId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CityModel{");
        sb.append("cityIataCode='").append(cityIataCode).append('\'');
        sb.append(", countryIsoCode='").append(countryIsoCode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", airportsId=").append(airportsId);
        sb.append('}');
        return sb.toString();
    }
}
