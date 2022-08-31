package com.ben.service;

import com.ben.dto.CountriesDto;
import com.ben.entity.Countries;

import java.util.List;

public interface CountryService {

    CountriesDto getOneCountry(int id);
    void saveAll(List<Countries> countries);
    CountriesDto getByImeDrzava(String imeDrzava);
}
