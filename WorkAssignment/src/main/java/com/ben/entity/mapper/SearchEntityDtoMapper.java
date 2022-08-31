package com.ben.entity.mapper;

import com.ben.dto.SearchDto;
import com.ben.entity.Search;
import com.ben.repository.CountryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.function.Function;
@Component
public class SearchEntityDtoMapper implements Function<SearchDto, Search> {

    @Override
    public Search apply(SearchDto searchDto) {
        Search search = new Search();
        search.setId(searchDto.getId());
        search.setIdDrzava(searchDto.getIdDrzava());
        search.setDatumOd(searchDto.getDatumOd());
        search.setDatumDo(searchDto.getDatumDo());

        return search;

    }
}
