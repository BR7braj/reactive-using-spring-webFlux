package com.brajesh.reactiveapi.service;

import java.time.Duration;

import com.brajesh.reactiveapi.modal.Product;
import com.brajesh.reactiveapi.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class ProductService {

    ProductRepository repository;

    @Autowired
    public ProductService (final ProductRepository repository)
    {
        this.repository = repository;
    }

    public Flux<Product> getProducts() {
        // whole method takes 10 second 
        //but the client will get each product at interval of 5 seconds.
        return repository.findAll().delayElements(Duration.ofSeconds(5));   
        
    }



    
}
