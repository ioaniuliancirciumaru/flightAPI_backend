package com.codecool.flight_api_project;
import com.codecool.flight_api_project.airport.AirportRepository;
import com.codecool.flight_api_project.city.CityRepository;
import com.codecool.flight_api_project.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class FlightApiProjectApplication{

//    public static FlightModel flightModel = new FlightModel("btf1308", "buc", "arad",
//            new Date(120 , Calendar.OCTOBER, 10),new Date(120, Calendar.NOVEMBER, 11),
//            45, 564);
//
//    public static AirportModel airportModel = new AirportModel("Otopeni","OTP","Bucuresti",Arrays.asList(flightModel));

//    public static CityModel cityModel = new CityModel("Rome", Arrays.asList(airportModel));


//    public static AirplaneModel airplaneModel = new AirplaneModel("Boeing 747",250,880.00);

//    public static AirlineModel airlineModel = new AirlineModel("Tarom", "B-737");



    public static void main(String[] args) throws IOException {
//        FlightRepository fr = new FlightRepository();
//        fr.insertFlight(flightModel);
//        AirportRepository ar =  new AirportRepository();
//        ar.insertAirport(airportModel);
//        CityRepository cr = new CityRepository();
//        cr.insertCity(cityModel);
//        AirplaneRepository am = new AirplaneRepository();
//        am.insertAirplane(airplaneModel);
//        AirlineRepository airlineRepository = new AirlineRepository();
//        airlineRepository.insertAirline(airlineModel);

//        FlightRepository fr = new FlightRepository();
//        fr.insertFlight(flightModel);
//        AirportRepository ar =  new AirportRepository();
//        ar.insertAirport(airportModel);
        UserRepository userRepository = new UserRepository();
        userRepository.populatedUsersList();
        CityRepository cityRepository = new CityRepository();
        cityRepository.populatedCitiesList();
        AirportRepository airportRepository = new AirportRepository();
        airportRepository.populatedAirportsList();
        SpringApplication.run(FlightApiProjectApplication.class, args);
    }

}
