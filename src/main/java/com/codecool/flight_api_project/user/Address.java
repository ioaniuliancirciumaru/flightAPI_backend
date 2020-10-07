package com.codecool.flight_api_project.user;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    private Geo geo;

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public Address() {}

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("street='").append(street).append('\'');
        sb.append(", suite='").append(suite).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", zipcode='").append(zipcode).append('\'');
        sb.append(", geo=").append(geo);
        sb.append('}');
        return sb.toString();
    }
}
