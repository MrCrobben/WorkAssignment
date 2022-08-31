package com.ben.dto.mapper;

import com.ben.dto.SearchResultDto;
import com.ben.entity.SearchResult;
import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class SearchResultDtoMapper implements Function<SearchResult, SearchResultDto> {
    @Override
    public SearchResultDto apply(SearchResult searchResult) {
        if(searchResult == null){
            return null;
        }
        SearchResultDto sDto = new SearchResultDto();
        sDto.setId(searchResult.getId());
        sDto.setKriticniSlucajevi(searchResult.getKriticniSlucajevi());
        sDto.setOporavljeni(searchResult.getOporavljeni());
        sDto.setAktivniSlucajevi(searchResult.getAktivniSlucajevi());
        sDto.setIdPretraga(searchResult.getIdPretraga());
        sDto.setNoviSlucajevi(searchResult.getNoviSlucajevi());
        return sDto;
    }
}
