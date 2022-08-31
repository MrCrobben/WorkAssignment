package com.ben.dto;

import com.ben.entity.Search;
import lombok.Data;

@Data
public class StatisticsDto {
    public StatisticsDto(int idPretraga){
        this.noviSlucajevi=0;
        this.aktivniSlucajevi=0;
        this.kriticniSlucajevi=0;
        this.oporavljeni=0;
        this.idPretraga=idPretraga;
    }
    private int id;
    private int idPretraga;
    private double noviSlucajevi;
    private double aktivniSlucajevi;
    private double kriticniSlucajevi;
    private double oporavljeni;
}
