package com.example.api.services;

import com.example.api.response.PokemonsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PokemonService {

    @Autowired
    private WebClient webClient;

    public PokemonsResponse fetchAllPokemonsFromApi(String limit, String offset) {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/pokemon")
                        .queryParam("limit", limit)
                        .queryParam("offset", offset)
                        .build())
                .retrieve()
                .bodyToMono(PokemonsResponse.class)
                .block();
    }
}
