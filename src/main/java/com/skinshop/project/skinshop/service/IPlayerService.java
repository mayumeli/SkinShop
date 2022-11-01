package com.skinshop.project.skinshop.service;

import com.skinshop.project.skinshop.dto.PlayerDTO;
import com.skinshop.project.skinshop.models.Player;

public interface IPlayerService {
    PlayerDTO createPlayer(Player player);
}
