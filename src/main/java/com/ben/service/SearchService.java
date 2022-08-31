package com.ben.service;


import com.ben.dto.SearchDto;
import com.ben.entity.Search;

import java.time.LocalDate;
import java.util.Set;


public interface SearchService {

    Set<SearchDto> getSearchByIdDrzava(int idDrzava);

    void deleteByParameters(int idDrzava, LocalDate datumOd, LocalDate datumDo);
    Set<SearchDto> getByParams(int idDrzava,String datumOd,String datumDo);
    void save(SearchDto search);
    SearchDto getLastInsertedId();
}
