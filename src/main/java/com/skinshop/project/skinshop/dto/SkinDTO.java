package com.skinshop.project.skinshop.dto;

import com.skinshop.project.skinshop.models.Skin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SkinDTO {
 
    public Long id;
    public String name;
    public Double value;

    public SkinDTO(Skin skin) {
        this.id = skin.getId();
        this.name = skin.getName();
        this.value = skin.getValue();
    }
}
