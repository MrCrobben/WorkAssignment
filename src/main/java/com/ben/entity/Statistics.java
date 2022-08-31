package com.ben.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Table(name = "statistika")
@Entity
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Column(name = "idpretraga")
    private int idPretraga;

    @NotEmpty
    @Column(name = "novislucajevi")
    private double noviSlucajevi;

    @NotEmpty
    @Column(name = "aktivnislucajevi")
    private double aktivniSlucajevi;

    @NotEmpty
    @Column(name = "kriticnislucajevi")
    private double kriticniSlucajevi;

    @NotEmpty
    @Column(name = "oporavljeni")
    private double oporavljeni;
}
