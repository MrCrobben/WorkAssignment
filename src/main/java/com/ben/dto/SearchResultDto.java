package com.ben.dto;

import com.ben.entity.Search;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResultDto {
    private int id;
    private int idPretraga;
    private int noviSlucajevi;
    private int aktivniSlucajevi;
    private int kriticniSlucajevi;
    private int oporavljeni;
}
