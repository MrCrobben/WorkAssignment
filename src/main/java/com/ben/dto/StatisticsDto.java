package com.ben.dto;

import com.ben.entity.Search;
import lombok.Data;

@Data
public class StatisticsDto {
    private int id;
    private int idPretraga;
    private double noviSlucajevi;
    private double aktivniSlucajevi;
    private double kriticniSlucajevi;
    private double oporavljeni;
}
