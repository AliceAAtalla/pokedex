package com.example.api.response;

import jakarta.persistence.Embeddable;

@Embeddable
public class PokemonResponse {

    private String name;
    private String url;

    public PokemonResponse() {}

    public PokemonResponse(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
