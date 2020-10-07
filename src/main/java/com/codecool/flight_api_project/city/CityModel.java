package com.codecool.flight_api_project.city;

import com.codecool.flight_api_project.airport.AirportModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CityModel {

    private String cityIataCode;
    private String countryIsoCode;
    private String cityName;
    private List<String> airportsId = new ArrayList<>();

    public CityModel(String cityIataCode, String countryIsoCode, String cityName, List<String> airportsId) {
        this.cityIataCode = cityIataCode;
        this.countryIsoCode = countryIsoCode;
        this.cityName = cityName;
        this.airportsId = airportsId;
    }

    public CityModel() {
    }

    public String getCityIataCode() {
        return cityIataCode;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public String getCityName() {
        return cityName;
    }

    public List<String> getAirportsId() {
        return airportsId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CityModel{");
        sb.append("cityIataCode='").append(cityIataCode).append('\'');
        sb.append(", countryIsoCode='").append(countryIsoCode).append('\'');
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append(", airportsId=").append(airportsId);
        sb.append('}');
        return sb.toString();
    }
}
