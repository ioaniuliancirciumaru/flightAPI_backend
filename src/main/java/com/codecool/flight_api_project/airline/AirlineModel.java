package com.codecool.flight_api_project.airline;

public class AirlineModel {
    private String name;
    private String airplane;
    //    private List<Airplane> airplanes = new ArrayList<>();


    public AirlineModel(String name, String airplane) {
        this.name = name;
        this.airplane = airplane;
    }

    public String getName() {
        return name;
    }

    public String getAirplane() {
        return airplane;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AirlineModel{");
        sb.append("name='").append(name).append('\'');
        sb.append(", airplane='").append(airplane).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
