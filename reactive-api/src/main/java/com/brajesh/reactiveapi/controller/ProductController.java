package com.brajesh.reactiveapi.controller;

import com.brajesh.reactiveapi.modal.Product;
import com.brajesh.reactiveapi.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service)
        {
            this.service = service;

        }

    @GetMapping(path =   "/product" , produces = MediaType.TEXT_EVENT_STREAM_VALUE )
    public Flux<Product> getAllProducts()
        {
            return service.getProducts();
        }
    
}
