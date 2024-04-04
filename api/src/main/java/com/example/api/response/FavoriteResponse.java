package com.example.api.response;

import java.util.List;

public class FavoriteResponse {

    private Long id;

    private String name;

    private List<PokemonResponse> pokemons;

    public FavoriteResponse() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PokemonResponse> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<PokemonResponse> pokemons) {
        this.pokemons = pokemons;
    }
}
