package edu.escuelaing.ieti.app.repository;


import edu.escuelaing.ieti.app.repository.document.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<Weather,String> {
}
