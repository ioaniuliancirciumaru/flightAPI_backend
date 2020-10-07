package com.codecool.flight_api_project.user;

public class Geo {
    private String lat;
    private String lng;

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Geo() {}

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Geo{");
        sb.append("lat='").append(lat).append('\'');
        sb.append(", lng='").append(lng).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
