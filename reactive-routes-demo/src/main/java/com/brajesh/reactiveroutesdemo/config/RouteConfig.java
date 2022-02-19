package com.brajesh.reactiveroutesdemo.config;

import com.brajesh.reactiveroutesdemo.handlers.ProductHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouteConfig {

    
    @Bean
    public RouterFunction<ServerResponse> router(ProductHandler handler) {
        return RouterFunctions.route().GET("/products", handler::getAll)
                .build();

    }

}
