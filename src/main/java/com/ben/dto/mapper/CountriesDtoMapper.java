package com.ben.dto.mapper;

import com.ben.dto.CountriesDto;
import com.ben.entity.Countries;
import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class CountriesDtoMapper implements Function<Countries, CountriesDto> {
    @Override
    public CountriesDto apply(Countries countries) {
        if(countries == null){
            return null;
        }
        CountriesDto cDto = new CountriesDto();
        cDto.setImeDrzava((countries.getImeDrzava()));
        cDto.setId(countries.getId());
        return cDto;
    }
}
