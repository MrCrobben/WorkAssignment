package com.ben.dto.mapper;

import com.ben.dto.SearchDto;
import com.ben.entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.function.Function;
@Component
public class SearchDtoMapper implements Function<Search, SearchDto> {
    @Override
    public SearchDto apply(Search search) {
        if(search == null){
            return null;
        }
        SearchDto sDto = new SearchDto();
        sDto.setId(search.getId());
        sDto.setDatumDo(search.getDatumDo());
        sDto.setDatumOd(search.getDatumOd());
        sDto.setIdDrzava(search.getIdDrzava());

        return sDto;
    }
}
