package com.skinshop.project.skinshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skinshop.project.skinshop.models.Skin;

public interface SkinRepo extends JpaRepository<Skin, Long> {

}
