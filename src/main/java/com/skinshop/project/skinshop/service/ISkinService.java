package com.skinshop.project.skinshop.service;

import java.util.List;

import com.skinshop.project.skinshop.dto.SkinDTO;
import com.skinshop.project.skinshop.models.Skin;

public interface ISkinService {
    
    SkinDTO createSkin(Skin skin);

    List<SkinDTO> getAllSkins();
}
