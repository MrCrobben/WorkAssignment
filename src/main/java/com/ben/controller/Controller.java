package com.ben.controller;

import com.ben.dto.CountriesDto;
import com.ben.dto.GenericDto;
import com.ben.service.impl.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class Controller implements ControllerInt {

    private final CountryServiceImpl csi;
    @Autowired
    public Controller(CountryServiceImpl csi){
        this.csi=csi;
    }

    @Override
    public String getOneCountry(int id) {
        return csi.getOneCountry(id).toString();
    }


}
