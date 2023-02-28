package edu.escuelaing.ieti.app.controller.weather;

import edu.escuelaing.ieti.app.repository.Dto.LocationDto;
import edu.escuelaing.ieti.app.repository.Dto.WeatherDto;
import edu.escuelaing.ieti.app.repository.document.Location;
import edu.escuelaing.ieti.app.repository.document.Weather;
import edu.escuelaing.ieti.app.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/location")
public class LocationController {
    private final LocationService locationService;

    public LocationController(@Autowired LocationService locationService){
        this.locationService = locationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getLocation(@PathVariable String id){
        return ResponseEntity.ok(locationService.findWeather(id));
    }

    @PostMapping
    public ResponseEntity<Location> createLocation(@RequestBody LocationDto locationDto){
        return ResponseEntity.ok(locationService.createLocation(locationDto));
    }
}
