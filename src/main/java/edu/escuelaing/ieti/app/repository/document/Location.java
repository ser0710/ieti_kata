package edu.escuelaing.ieti.app.repository.document;


import edu.escuelaing.ieti.app.repository.Dto.LocationDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location {

    @Id
    String id;

    String city;
    String country;
    String region;

    Weather weather;

    public Location() {
    }

    public Location(String id, String city, String country, String region, Weather weather) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.region = region;
        this.weather = weather;
    }

    public Location(LocationDto locationDto){
        this.weather = locationDto.getWeather();
        this.city = locationDto.getCity();
        this.country = locationDto.getCountry();
        this.region = locationDto.getRegion();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void update( LocationDto locationDto ) {
        this.weather = locationDto.getWeather();
        this.city = locationDto.getCity();
        this.country = locationDto.getCountry();
        this.region = locationDto.getRegion();
    }
}

