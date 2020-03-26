package org.anakinsky.simplerest;

import org.anakinsky.simplerest.entity.Ingredient;
import org.anakinsky.simplerest.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRest {

//    @Autowired
//    private IngredientRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SimpleRest.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//
//        repository.deleteAll();
//
//        // save a couple of customers
//        repository.save(new Ingredient("Water"));
//        repository.save(new Ingredient("Egg"));
//
//        // fetch all customers
//        System.out.println("Ingredient found with findAll():");
//        System.out.println("-------------------------------");
//        for (Ingredient ingredient : repository.findAll()) {
//            System.out.println(ingredient);
//        }
//        System.out.println();
//
//        // fetch an individual customer
//        System.out.println("Ingredient found with findByName('Egg'):");
//        System.out.println("--------------------------------");
//        System.out.println(repository.findByName("Egg"));
//
//
//    }
}
