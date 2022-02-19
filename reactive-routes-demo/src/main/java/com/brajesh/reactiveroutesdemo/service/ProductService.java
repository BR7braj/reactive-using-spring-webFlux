package com.brajesh.reactiveroutesdemo.service;

import java.time.Duration;
import java.util.List;

import com.brajesh.reactiveroutesdemo.modal.Product;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class ProductService {

    public Flux<Product> getAll ()
     {  
         var p1 = new Product();
         p1.setName("Apple");

         var p2 = new Product();
         p2.setName("Orange");

         // Simulate something happens with each product
         Flux<Product> products = 
            Flux.fromStream(List.of(p1, p2).stream()).delayElements(Duration.ofSeconds(3));

        return products;
     }

    
}
