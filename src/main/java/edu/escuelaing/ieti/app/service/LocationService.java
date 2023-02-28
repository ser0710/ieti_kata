package edu.escuelaing.ieti.app.service;

import edu.escuelaing.ieti.app.repository.Dto.LocationDto;
import edu.escuelaing.ieti.app.repository.document.Location;

import java.util.Optional;

public interface LocationService {
    Optional<Location> findWeather(String id);

    Location createLocation(LocationDto locationDto);
}
