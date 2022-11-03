package com.skinshop.project.skinshop.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"sales", "card"})
    private Player player; 

    @ManyToOne
    @JoinColumn(name = "skin_id", referencedColumnName = "id")
    @JsonIgnoreProperties("sales")
    private Skin skin;

    @Column(nullable = false)
    private Date date = new Date();

    @Column(nullable = false)
    private Boolean status = true;

    @Column
    private Date canceledAt;

}
