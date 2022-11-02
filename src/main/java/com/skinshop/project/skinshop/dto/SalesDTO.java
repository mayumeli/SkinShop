package com.skinshop.project.skinshop.dto;

import java.util.Date;

import com.skinshop.project.skinshop.models.Sales;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalesDTO {
    private long id;
    private long playerId;
    private long skinId;
    private Date date;

    public SalesDTO(Sales sales) {
        this.id = sales.getId();
        this.playerId = sales.getPlayer().getId();
        this.skinId = sales.getSkin().getId();
        this.date = sales.getDate();
    }
}
