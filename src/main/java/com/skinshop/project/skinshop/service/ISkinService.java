package com.skinshop.project.skinshop.service;

import java.util.List;

import com.skinshop.project.skinshop.models.Skin;

public interface ISkinService {
    
    Skin createSkin(Skin skin);

    List<Skin> getAllSkins();
}
