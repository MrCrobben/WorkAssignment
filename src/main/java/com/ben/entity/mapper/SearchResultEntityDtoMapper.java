package com.ben.entity.mapper;

import com.ben.dto.SearchResultDto;
import com.ben.entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.function.Function;
@Component
public class SearchResultEntityDtoMapper implements Function<SearchResultDto, SearchResult> {

    @Override
    public SearchResult apply(SearchResultDto searchResultDto) {
        SearchResult sr = new SearchResult();
        sr.setId(searchResultDto.getId());
        sr.setNoviSlucajevi(searchResultDto.getNoviSlucajevi());
        sr.setAktivniSlucajevi(searchResultDto.getAktivniSlucajevi());
        sr.setKriticniSlucajevi(searchResultDto.getKriticniSlucajevi());
        sr.setOporavljeni(searchResultDto.getOporavljeni());
        sr.setIdPretraga(sr.getIdPretraga());

        return sr;
    }
}
