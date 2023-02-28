package edu.escuelaing.ieti.app.repository;



import edu.escuelaing.ieti.app.repository.document.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location,String>{
}

