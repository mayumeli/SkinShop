package com.skinshop.project.skinshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skinshop.project.skinshop.dto.PlayerDTO;
import com.skinshop.project.skinshop.models.Player;
import com.skinshop.project.skinshop.repository.PlayerRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerService implements IPlayerService {

    private final PlayerRepo playerRepo;
    
    @Override
    public PlayerDTO createPlayer(Player player) {
        if (player.getCard() != null) {
            player.getCard().setPlayer(player);
        }
        return new PlayerDTO(playerRepo.save(player));
    }

    @Override
    public List<PlayerDTO> getAllPlayers() {
        return playerRepo.getAllPlayerDTOs();
    }
}
