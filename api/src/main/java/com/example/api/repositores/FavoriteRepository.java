package com.example.api.repositores;

import com.example.api.models.FavoriteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteModel, Long> {
}
