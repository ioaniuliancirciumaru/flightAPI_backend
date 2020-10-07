package com.codecool.flight_api_project;
import com.codecool.flight_api_project.airplane.AirplaneModel;
import com.codecool.flight_api_project.airplane.AirplaneRepository;
import com.codecool.flight_api_project.airline.AirlineModel;
import com.codecool.flight_api_project.airline.AirlineRepository;
import com.codecool.flight_api_project.airport.AirportModel;
import com.codecool.flight_api_project.airport.AirportRepository;
import com.codecool.flight_api_project.city.CityModel;
import com.codecool.flight_api_project.city.CityRepository;
import com.codecool.flight_api_project.flight.FlightModel;
import com.codecool.flight_api_project.flight.FlightRepository;
import com.codecool.flight_api_project.user.User;
import com.codecool.flight_api_project.user.UserRepository;
import com.codecool.flight_api_project.user.UserService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@SpringBootApplication
public class FlightApiProjectApplication{

//    public static FlightModel flightModel = new FlightModel("btf1308", "buc", "arad",
//            new Date(120 , Calendar.OCTOBER, 10),new Date(120, Calendar.NOVEMBER, 11),
//            45, 564);
//
//    public static AirportModel airportModel = new AirportModel("Otopeni","OTP","Bucuresti",Arrays.asList(flightModel));

    public static CityModel cityModel = new CityModel("Rome", Arrays.asList(airportModel));


    public static AirplaneModel airplaneModel = new AirplaneModel("Boeing 747",250,880.00);

    public static AirlineModel airlineModel = new AirlineModel("Tarom", "B-737");



    public static void main(String[] args)
    {
        FlightRepository fr = new FlightRepository();
        fr.insertFlight(flightModel);
        AirportRepository ar =  new AirportRepository();
        ar.insertAirport(airportModel);
        CityRepository cr = new CityRepository();
        cr.insertCity(cityModel);
        AirplaneRepository am = new AirplaneRepository();
        am.insertAirplane(airplaneModel);
        AirlineRepository airlineRepository = new AirlineRepository();
        airlineRepository.insertAirline(airlineModel);

//        FlightRepository fr = new FlightRepository();
//        fr.insertFlight(flightModel);
//        AirportRepository ar =  new AirportRepository();
//        ar.insertAirport(airportModel);
        UserRepository userRepository =new UserRepository();
        userRepository.populatedUsersList();
        SpringApplication.run(FlightApiProjectApplication.class, args);
    }

}
