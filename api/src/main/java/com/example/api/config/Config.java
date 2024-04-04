package com.example.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {
    @Bean
    public WebClient webClient() {
        String pokeApiUrl = "https://pokeapi.co/api/v2/";
        return WebClient.builder().baseUrl(pokeApiUrl).build();
    }
}
