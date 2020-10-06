package com.codecool.flight_api_project;

import com.codecool.flight_api_project.flight.FlightModel;
import com.codecool.flight_api_project.flight.FlightRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class FlightApiProjectApplication
{

    public static FlightModel flightModel = new FlightModel("btf1308", "buc", "arad",
            new Date(120 , Calendar.OCTOBER, 10),new Date(120, Calendar.NOVEMBER, 11),
            45, 564);


    public static void main(String[] args)
    {
        FlightRepository fr = new FlightRepository();
        fr.insertFlight(flightModel);
        SpringApplication.run(FlightApiProjectApplication.class, args);
    }

}
