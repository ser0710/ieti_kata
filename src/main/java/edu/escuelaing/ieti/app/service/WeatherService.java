package edu.escuelaing.ieti.app.service;


import edu.escuelaing.ieti.app.repository.Dto.WeatherDto;
import edu.escuelaing.ieti.app.repository.document.Weather;

import java.util.Optional;

public interface WeatherService {

    Weather createWeather(WeatherDto weatherDto);

    Optional<Weather> findById(String id);


}
