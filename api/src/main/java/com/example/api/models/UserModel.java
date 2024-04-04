package com.example.api.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<FavoriteModel> favoriteLists = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<FavoriteModel> getFavoriteLists() {
        return favoriteLists;
    }

    public void setFavoriteLists(List<FavoriteModel> favoriteLists) {
        this.favoriteLists = favoriteLists;
    }

    public void addFavoriteList(FavoriteModel list) {
        favoriteLists.add(list);
    }

    public FavoriteModel getFavoriteListById(Long id) {
        return favoriteLists.stream()
                .filter(list -> list.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
