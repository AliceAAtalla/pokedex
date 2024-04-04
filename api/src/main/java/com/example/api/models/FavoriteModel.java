package com.example.api.models;

import com.example.api.response.FavoriteResponse;
import com.example.api.response.PokemonResponse;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "favorites")
public class FavoriteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;


    @ManyToOne
    private UserModel user;

    @ElementCollection
    private List<PokemonResponse> pokemons;

    public FavoriteModel() {}

    public FavoriteModel(String name, UserModel user) {
        this();
        this.name = name;
        this.user = user;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

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
