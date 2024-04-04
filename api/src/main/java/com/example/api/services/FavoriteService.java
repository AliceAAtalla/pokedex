package com.example.api.services;

import com.example.api.models.FavoriteModel;
import com.example.api.models.UserModel;
import com.example.api.repositores.FavoriteRepository;
import com.example.api.response.FavoriteResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    public FavoriteModel createFavorite(FavoriteModel favorite) {
        return favoriteRepository.save(favorite);
    }

    public FavoriteModel createUserFavoriteList(UserModel user, FavoriteModel favorite) {
        favorite.setUser(user);
        return createFavorite(favorite);
    }

    public FavoriteModel createUserFavoriteList(UserModel user, String favoriteName) {
        FavoriteModel favorite = new FavoriteModel(favoriteName, user);
        return createFavorite(favorite);
    }

    public FavoriteResponse formatFavoriteResponse(FavoriteModel favoriteModel) {
        FavoriteResponse favoriteResponse = new FavoriteResponse();
        BeanUtils.copyProperties(favoriteModel, favoriteResponse);
        return favoriteResponse;
    }
}
