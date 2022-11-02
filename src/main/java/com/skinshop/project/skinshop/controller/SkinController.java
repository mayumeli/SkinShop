package com.skinshop.project.skinshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skinshop.project.skinshop.dto.SkinDTO;
import com.skinshop.project.skinshop.models.Skin;
import com.skinshop.project.skinshop.service.ISkinService;

@RestController
@RequestMapping("/skin")
public class SkinController {
    
    @Autowired
    private ISkinService skinService;

    @PostMapping
    public ResponseEntity<SkinDTO> createSkin(@RequestBody Skin skin) {
        return new ResponseEntity<>(skinService.createSkin(skin), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SkinDTO>> getAllSkins(){
        return new ResponseEntity<>(skinService.getAllSkins(), HttpStatus.OK);
    }

}
