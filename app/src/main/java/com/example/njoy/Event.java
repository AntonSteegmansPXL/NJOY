package com.example.njoy;

public class Event {

    private final String name;
    private final String city;
    private final String startDate;
    private final String endDate;
    private final String longitude;
    private final String latitude;

    public Event(String name, String city, String startDate, String endDate, String longitude, String latitude) {
        this.name = name;
        this.city = city;
        this.startDate = startDate;
        this.endDate = endDate;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }
}
