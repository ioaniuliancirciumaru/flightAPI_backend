package com.codecool.flight_api_project.flight;

import jdk.jfr.DataAmount;

import java.util.Date;

public class FlightModel
{
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private String departureDate;
    private String arrivalDate;
    private double price;
//    private Airline airline;
//    private Airplane airplane;
    private double distanceInKm;

    public FlightModel(
            String flightNumber,
            String departureAirport,
            String arrivalAirport,
            String departureDate,
            String arrivalDate,
            double price,
//            Airline airline,
//            Airplane airplane,
            double distanceInKm)
    {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.price = price;
//        this.airline = airline;
//        this.airplane = airplane;
        this.distanceInKm = distanceInKm;
    }

    public FlightModel()
    {
    }

    public String getFlightNumber()
    {
        return flightNumber;
    }

    public String getDepartureAirport()
    {
        return departureAirport;
    }

    public String getArrivalAirport()
    {
        return arrivalAirport;
    }

    public String getDepartureDate()
    {
        return departureDate;
    }

    public String getArrivalDate()
    {
        return arrivalDate;
    }

    public double getPrice()
    {
        return price;
    }

//    public Airline getAirline()
//    {
//        return airline;
//    }
//
//    public Airplane getAirplane()
//    {
//        return airplane;
//    }

    public double getDistanceInKm()
    {
        return distanceInKm;
    }

    @Override
    public String toString()
    {
        return "FlightModel{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", price=" + price +
//                ", airline=" + airline +
//                ", airplane=" + airplane +
                ", distanceInKm=" + distanceInKm +
                '}';
    }
}
