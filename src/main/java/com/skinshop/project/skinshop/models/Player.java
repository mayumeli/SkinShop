package com.skinshop.project.skinshop.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String email;

    // código legado
    // @ManyToMany
    // @JoinTable(
    //     name = "player_skin",
    //     joinColumns = @JoinColumn(name = "player_id", referencedColumnName = "id"),
    //     inverseJoinColumns = @JoinColumn(name = "skin_id", referencedColumnName = "id")
    // )
    // @JsonIgnoreProperties("players")
    // private Set<Skin> skins;

    @OneToMany(mappedBy = "player")
    Set<Sales> sales;
}
