package com.skinshop.project.skinshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skinshop.project.skinshop.models.Skin;
import com.skinshop.project.skinshop.repository.SkinRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkinService implements ISkinService {

    private final SkinRepo skinRepo;

    @Override
    public Skin createSkin(Skin skin) {
        return skinRepo.save(skin);
    }

    @Override
    public List<Skin> getAllSkins() {
        List<Skin> skins = skinRepo.findAll();
        return skins;
    }

}
