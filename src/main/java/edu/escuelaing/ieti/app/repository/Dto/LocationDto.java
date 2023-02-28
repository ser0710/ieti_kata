package edu.escuelaing.ieti.app.repository.Dto;

import edu.escuelaing.ieti.app.repository.document.Weather;
import org.springframework.data.annotation.Id;

public class LocationDto {

    String city;
    String country;
    String region;
    Weather weather;

    public LocationDto() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
