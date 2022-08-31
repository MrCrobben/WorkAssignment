package com.ben.service;

import com.ben.dto.SearchResultDto;

import java.util.Set;
public interface SearchResultService {

    Set<SearchResultDto> getSearchResultsByIdPretraga(int idPretraga);
    void deleteAll();
}
