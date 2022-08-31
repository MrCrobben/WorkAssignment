package com.ben.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchDto {
    private int id;
    private int idDrzava;
    private LocalDate datumOd;
    private LocalDate datumDo;
}
