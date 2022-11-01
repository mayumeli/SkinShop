package com.skinshop.project.skinshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skinshop.project.skinshop.dto.PlayerDTO;
import com.skinshop.project.skinshop.models.Player;
import com.skinshop.project.skinshop.service.IPlayerService;


@RestController
public class PlayerController {
    
    @Autowired
    private IPlayerService playerService;

    @PostMapping
    public ResponseEntity<PlayerDTO> createPlayer(@RequestBody Player player) {
        return new ResponseEntity<>(playerService.createPlayer(player), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PlayerDTO>> getAllPlayers(){
        return new ResponseEntity<>(playerService.getAllPlayers(), HttpStatus.OK);
    }
}
