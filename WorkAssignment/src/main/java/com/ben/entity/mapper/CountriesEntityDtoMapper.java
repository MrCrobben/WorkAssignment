package com.ben.entity.mapper;

import com.ben.dto.CountriesDto;
import com.ben.entity.Countries;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CountriesEntityDtoMapper implements Function<CountriesDto, Countries> {
    @Override
    public Countries apply(CountriesDto countriesDto) {
        Countries country = new Countries();
        country.setImeDrzava(countriesDto.getImeDrzava());
        country.setId(countriesDto.getId());
        return country;
    }
}
