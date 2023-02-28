package edu.escuelaing.ieti.app.service;


import edu.escuelaing.ieti.app.repository.Dto.WeatherDto;
import edu.escuelaing.ieti.app.repository.WeatherRepository;
import edu.escuelaing.ieti.app.repository.document.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class WeatherServiceMongoDB implements WeatherService{

    private final WeatherRepository weatherRepository;

    public WeatherServiceMongoDB(@Autowired WeatherRepository weatherRepository){
        this.weatherRepository = weatherRepository;
    }

    @Override
    public Weather createWeather(WeatherDto weatherDto) {
        return weatherRepository.save(new Weather(weatherDto));
    }

    @Override
    public Optional<Weather> findById(String id) {
        return weatherRepository.findById(id);
    }
}
