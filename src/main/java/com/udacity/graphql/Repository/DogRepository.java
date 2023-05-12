package com.udacity.graphql.Repository;

import com.udacity.graphql.Entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
