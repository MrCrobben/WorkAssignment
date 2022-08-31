package com.ben.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class CountriesDto {

    private int id;
    private String imeDrzava;

    public CountriesDto(String imeDrzava){
        this.imeDrzava=imeDrzava;
    }
    public CountriesDto(){}
}
