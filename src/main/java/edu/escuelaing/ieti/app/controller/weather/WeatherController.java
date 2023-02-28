package edu.escuelaing.ieti.app.controller.weather;


import edu.escuelaing.ieti.app.repository.Dto.LocationDto;
import edu.escuelaing.ieti.app.repository.Dto.WeatherDto;
import edu.escuelaing.ieti.app.repository.document.Location;
import edu.escuelaing.ieti.app.repository.document.Weather;
import edu.escuelaing.ieti.app.service.LocationService;
import edu.escuelaing.ieti.app.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping( "/v1/weather" )
public class WeatherController {

    private final WeatherService weatherService;

    private final LocationService locationService;

    public WeatherController( @Autowired WeatherService weatherService, @Autowired LocationService locationService )
    {
        this.weatherService = weatherService;
        this.locationService = locationService;
    }

    @PostMapping("/{locationId}")
    public ResponseEntity<Weather> create(@RequestBody WeatherDto weatherDto, @PathVariable String locationId){
        Optional<Location> location = locationService.findWeather(locationId);

        return ResponseEntity.ok(weatherService.createWeather(weatherDto));
    }


}

