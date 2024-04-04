package com.example.api.services;

import com.example.api.models.UserModel;
import com.example.api.repositores.FavoriteRepository;
import com.example.api.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Autowired
    private WebClient webClient;

    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
