package com.brajesh.reactiveroutesdemo.handlers;

import com.brajesh.reactiveroutesdemo.modal.Product;
import com.brajesh.reactiveroutesdemo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class ProductHandler {
    private final ProductService productService;

    @Autowired
    public ProductHandler(ProductService productService) {
        this.productService = productService;
    }

    public Mono<ServerResponse> getAll(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM).body(productService.getAll(), Product.class);

        
    }
}
