package com.ben.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Table(name = "rezultatpretrage")
@Entity
public class SearchResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    private int idPretraga;

    @NotEmpty
    private int noviSlucajevi;
    @NotEmpty
    private int aktivniSlucajevi;
    @NotEmpty
    private int kriticniSlucajevi;
    @NotEmpty
    private int oporavljeni;

}
