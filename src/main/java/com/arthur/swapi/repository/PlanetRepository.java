package com.arthur.swapi.repository;

import com.arthur.swapi.domain.Planet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanetRepository extends MongoRepository<Planet, String>{
}
