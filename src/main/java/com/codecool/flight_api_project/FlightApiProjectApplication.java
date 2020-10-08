package com.codecool.flight_api_project;
import com.codecool.flight_api_project.airline.AirlineRepository;
import com.codecool.flight_api_project.airplane.AirplaneRepository;
import com.codecool.flight_api_project.airport.AirportRepository;
import com.codecool.flight_api_project.city.CityRepository;
import com.codecool.flight_api_project.flight.FlightModel;
import com.codecool.flight_api_project.flight.FlightService;
import com.codecool.flight_api_project.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class FlightApiProjectApplication{

    public static void main(String[] args) throws IOException {

        UserRepository userRepository = new UserRepository();
        userRepository.populatedUsersList();

        CityRepository cityRepository = new CityRepository();
        cityRepository.populatedCitiesList();

        AirportRepository airportRepository = new AirportRepository();
        airportRepository.populatedAirportsList();

        AirlineRepository airlineRepository = new AirlineRepository();
        airlineRepository.populatedAirlinesList();

        AirplaneRepository airplaneRepository = new AirplaneRepository();
        airplaneRepository.populatedAirplanesList();

//        FlightService flightService = new FlightService();
//        flightService.populateRepositories();

        SpringApplication.run(FlightApiProjectApplication.class, args);

    }

}
