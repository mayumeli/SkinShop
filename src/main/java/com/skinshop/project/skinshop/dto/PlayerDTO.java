package com.skinshop.project.skinshop.dto;

import com.skinshop.project.skinshop.models.Player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlayerDTO {

    private Long id;
    private String nickname;
    private String email;
 
    public PlayerDTO(Player player) {
        this.id = player.getId();
        this.nickname = player.getNickname();
        this.email = player.getEmail();
    }
}
