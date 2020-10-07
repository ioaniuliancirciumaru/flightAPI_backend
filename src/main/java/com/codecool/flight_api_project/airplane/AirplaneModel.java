package com.codecool.flight_api_project.airplane;

public class AirplaneModel {

    private String name;
    private int numberOfSeats;
    private double speed;

    public AirplaneModel(String name, int numberOfSeats, double speed) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.speed = speed;
    }

    public AirplaneModel() {
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AirportModel{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numberOfSeats=").append(numberOfSeats);
        sb.append(", speed=").append(speed);
        sb.append('}');
        return sb.toString();
    }
}
