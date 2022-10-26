package com.skinshop.project.skinshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skinshop.project.skinshop.models.Player;

public interface PlayerRepo extends JpaRepository<Player, Long> {

}

