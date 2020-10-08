package com.codecool.flight_api_project.flight;


import com.codecool.flight_api_project.airline.AirlineModel;
import com.codecool.flight_api_project.airline.AirlineRepository;
import com.codecool.flight_api_project.airport.Airport;
import com.codecool.flight_api_project.airport.AirportRepository;


import com.codecool.flight_api_project.city.CityModel;
import com.codecool.flight_api_project.city.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService
{

    @Autowired
    private final FlightRepository flightRepository;

    private final AirportRepository airportRepository = new AirportRepository();
    private final CityRepository cityRepository = new CityRepository();
    private final AirlineRepository airlineRepository = new AirlineRepository();

    public FlightService(FlightRepository flightRepository)
    {
        this.flightRepository = flightRepository;
    }


    public void addFlight(FlightModel flightModel)
    {
        flightRepository.insertFlight(flightModel);
    }

    public List<FlightModel> searchFlight(String fromCity, String toCity, LocalDate date){
        List<FlightModel> flightModels  = new ArrayList<>();
        System.out.println(date);
        List<AirlineModel> airlineModels = airlineOnAirport(fromCity);
        if(checkIfAirlineExistsAtTheFromAirport(fromCity, toCity)) {
            for (CityModel fromCityModel : cityRepository.selectAllCities()) {
                if (fromCityModel.getCityName().equals(fromCity)) {
                    for (CityModel toCityModel : cityRepository.selectAllCities()) {
                        if (toCityModel.getCityName().equals(toCity)) {
                            flightModels.add(new FlightModel(fromCityModel, toCityModel, date, airlineModels));
                        }
                    }
                }
            }
        }
        return flightModels;
    }


//    Lista de id-uri ale aeroporturilor din oras respectiv

    public List<String> airportsIdFromCity(String city){
        List<String> _tempFromAirportId = new ArrayList<>();
        for(CityModel _city: cityRepository.selectAllCities()){
            if(_city.getCityName().equals(city)){
                System.out.println(_city.getAirportsId() + " ------->>> din orase");
                _tempFromAirportId.addAll(_city.getAirportsId());
                }
            }
        return _tempFromAirportId;
    }

//    Lista de id-uri Airline din aeroport/oras respectiv
    public List<Integer> airlinesIdFromAirport (String _airport){
        List<Integer> _airlinesIDFromAirport = new ArrayList<>();
        for(Airport airport: airportRepository.selectAllAirports()){
            System.out.println(airport);
            for(String airportID: airportsIdFromCity(_airport)) {
                System.out.println(airportID + "------>>>>>>id aeroport");
                if (airport.getAirportIataCode().equals(airportID)) {
                    _airlinesIDFromAirport.addAll(airport.getAirlinesID());
                }
            }
        }
        System.out.println(_airlinesIDFromAirport.toString());
        return _airlinesIDFromAirport;
    }

//    Verificam daca airline exista pe ambele aeroporturi

    public boolean checkIfAirlineExistsAtTheFromAirport(String fromAirport, String toAirport ){
        for(int _idAirlineFromAirport: airlinesIdFromAirport(fromAirport)){
            System.out.println(_idAirlineFromAirport + " === from");
            for(int _idAirlineToAirport: airlinesIdFromAirport(toAirport)){
                System.out.println(_idAirlineToAirport + " --- to");
                if(_idAirlineFromAirport == _idAirlineToAirport){
                    return true;
                }
            }
        }
        return false;
    }

//    airline pe aeroport-- descriere
    public List<AirlineModel> airlineOnAirport(String from){
        List<AirlineModel> airlineModelOnAirport = new ArrayList<>();
        for(AirlineModel airlineModel: airlineRepository.selectAllAirline()){
            for(int id: airlinesIdFromAirport(from)){
                if(airlineModel.getId() == id){
                    airlineModelOnAirport.add(airlineModel);
                }
            }
        }
        return airlineModelOnAirport.stream()
                .distinct()
                .collect(Collectors.toList());
    }





    public List<FlightModel> allFlights()
    {
        return flightRepository.selectAllFlights();
    }
}
