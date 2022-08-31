package com.ben.service.impl;

import com.ben.dto.CountriesDto;
import com.ben.dto.mapper.CountriesDtoMapper;
import com.ben.entity.mapper.CountriesEntityDtoMapper;
import com.ben.repository.CountryDao;
import com.ben.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryDao countryDao;
    private final CountriesDtoMapper mapper;
    @Autowired
    public CountryServiceImpl(CountryDao countryDao,CountriesDtoMapper mapper){
        this.countryDao=countryDao;
        this.mapper=mapper;
    }

    @Override
    public CountriesDto getOneCountry(int id) {
        return mapper.apply(countryDao.getById(id));
    }
}
