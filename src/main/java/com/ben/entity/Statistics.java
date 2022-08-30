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

    private int idPretraga;

    @NotEmpty
    private double noviSlucajevi;

    @NotEmpty
    private double aktivniSlucajevi;

    @NotEmpty
    private double kriticniSlucajevi;

    @NotEmpty
    private double oporavljeni;
}
