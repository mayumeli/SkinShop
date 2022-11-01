package com.skinshop.project.skinshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skinshop.project.skinshop.dto.PlayerDTO;
import com.skinshop.project.skinshop.models.Player;

public interface PlayerRepo extends JpaRepository<Player, Long> {

    public String path = "com.skinshop.project.skinshop.dto.";

    @Query(value = "select new " + path + "PlayerDTO(p) from Player p")
    List<PlayerDTO> getAllPlayerDTOs();
}

