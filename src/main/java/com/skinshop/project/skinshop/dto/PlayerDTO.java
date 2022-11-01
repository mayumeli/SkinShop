package com.skinshop.project.skinshop.dto;

import com.skinshop.project.skinshop.models.Player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PlayerDTO {

    private Long id;
    private String name;
    private String email;
 
    public PlayerDTO(Player player) {
        this.id = player.getId();
        this.name = player.getNickname();
        this.email = player.getEmail();
    }
}
