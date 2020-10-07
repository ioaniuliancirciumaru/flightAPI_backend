package com.codecool.flight_api_project.user;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public Company() {}

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Company{");
        sb.append("name='").append(name).append('\'');
        sb.append(", catchPhrase='").append(catchPhrase).append('\'');
        sb.append(", bs='").append(bs).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
