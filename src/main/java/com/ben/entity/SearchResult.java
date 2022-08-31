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
    @Column(name = "idpretraga")
    private int idPretraga;

    @NotEmpty
    @Column(name = "novislucajevi")
    private int noviSlucajevi;
    @NotEmpty
    @Column(name = "aktivnislucajevi")
    private int aktivniSlucajevi;
    @NotEmpty
    @Column(name = "kriticnislucajevi")
    private int kriticniSlucajevi;
    @NotEmpty
    @Column(name = "oporavljeni")
    private int oporavljeni;

}
