package com.skinshop.project.skinshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skinshop.project.skinshop.dto.SkinDTO;
import com.skinshop.project.skinshop.models.Skin;

public interface SkinRepo extends JpaRepository<Skin, Long> {

    @Query(value = "select new com.skinshop.project.skinshop.dto.SkinDTO(s) from Skin s")
    List<SkinDTO> getAllSkinDTOs();
}
