package org.anakinsky.simplerest.repository;

import org.anakinsky.simplerest.entity.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient, Long> {

    public Ingredient findByName(String name);
}
