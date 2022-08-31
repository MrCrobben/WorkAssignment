package com.ben.dto;

import com.ben.entity.Countries;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchDto {
    private int id;
    private int idDrzava;
    private Date datumOd;
    private Date datumDo;
}
