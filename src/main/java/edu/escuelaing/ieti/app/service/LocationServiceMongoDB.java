package edu.escuelaing.ieti.app.service;

import edu.escuelaing.ieti.app.repository.Dto.LocationDto;
import edu.escuelaing.ieti.app.repository.LocationRepository;
import edu.escuelaing.ieti.app.repository.document.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationServiceMongoDB implements LocationService {
    private final LocationRepository locationRepository;

    public LocationServiceMongoDB(@Autowired LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    public Optional<Location> findWeather(String id){
        return locationRepository.findById(id);
    }

    @Override
    public Location createLocation(LocationDto locationDto) {
        return locationRepository.save(new Location(locationDto));
    }
}
