package com.ben.controller;

import com.ben.dto.CountriesDto;
import com.ben.dto.GenericDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

public interface ControllerInt {


    @GetMapping("/ruda/{id}")
    public String getOneCountry(@PathVariable int id);
}
