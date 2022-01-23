package com.brajesh.reactiveapi.repository;

import com.brajesh.reactiveapi.modal.Product;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer>{
    
}
