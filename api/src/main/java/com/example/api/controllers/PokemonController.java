package com.example.api.controllers;

import com.example.api.response.PokemonsResponse;
import com.example.api.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemons")
    public ResponseEntity<PokemonsResponse> getAllPokemons(@RequestParam(defaultValue = "10") String limit,
                                                           @RequestParam(defaultValue = "10") String offset) {
        PokemonsResponse result = pokemonService.fetchAllPokemonsFromApi(limit, offset);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
