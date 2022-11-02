package com.skinshop.project.skinshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skinshop.project.skinshop.dto.SkinDTO;
import com.skinshop.project.skinshop.models.Skin;
import com.skinshop.project.skinshop.repository.SkinRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkinService implements ISkinService {

    private final SkinRepo skinRepo;

    @Override
    public SkinDTO createSkin(Skin skin) {
        return new SkinDTO(skinRepo.save(skin));
    }

    @Override
    public List<SkinDTO> getAllSkins() {
        List<SkinDTO> skins = skinRepo.getAllSkinDTOs();
        return skins;
    }

}
