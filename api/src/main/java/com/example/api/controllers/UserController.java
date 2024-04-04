package com.example.api.controllers;

import com.example.api.models.FavoriteModel;
import com.example.api.models.UserModel;
import com.example.api.response.FavoriteResponse;
import com.example.api.services.FavoriteService;
import com.example.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private FavoriteService favoriteService;

    @PostMapping("/user")
    public ResponseEntity<UserModel> saveUser() {
        UserModel user = userService.createUser(new UserModel());
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/user/{userId}/favorite")
    public ResponseEntity<Object> saveFavorite(@PathVariable Long userId,
                                               @RequestParam String favoriteName) {
        Optional<UserModel> user = userService.getUserById(userId);

        if(user.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
        }

        FavoriteModel favoriteCreated = favoriteService.createUserFavoriteList(user.get(), favoriteName);

        if (favoriteCreated == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create favorite.");
        }

        FavoriteResponse response = favoriteService.formatFavoriteResponse(favoriteCreated);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
