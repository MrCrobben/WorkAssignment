package com.ben.controller.impl;

import com.ben.controller.Controller;
import com.ben.dto.SearchDto;
import com.ben.dto.SearchResultDto;
import com.ben.dto.StatisticsDto;
import com.ben.service.impl.CountryServiceImpl;
import com.ben.service.impl.SearchResultServiceImpl;
import com.ben.service.impl.SearchServiceImpl;
import com.ben.service.impl.StatisticsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;


@RestController
public class ControllerImpl implements Controller {

    private final CountryServiceImpl countryService;
    private final SearchServiceImpl searchService;
    private final StatisticsServiceImpl statisticsService;
    private final SearchResultServiceImpl searchResultService;
    private final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.uuuu.");
    @Autowired
    public ControllerImpl(SearchServiceImpl searchService,
                          CountryServiceImpl countryService,
                          StatisticsServiceImpl statisticsService,
                          SearchResultServiceImpl searchResultService){
        this.searchResultService=searchResultService;
        this.statisticsService=statisticsService;
        this.countryService=countryService;
        this.searchService=searchService;
    }


    @Override
    public String clearDb() {
        searchService.deleteAll();
        statisticsService.deleteAll();
        searchResultService.deleteAll();
        return "Deleted all tables";
    }

    @Override
    public String clearByParam(String drzava, String datumOd, String datumDo) {
        int idDrzava = countryService.getByImeDrzava(drzava).getId();
        LocalDate d1,d2;
        d1=LocalDate.parse(datumOd,formatter);
        d2=LocalDate.parse(datumDo,formatter);
        try{

            searchService.deleteByParameters(idDrzava, d1,d2);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return e.getMessage();

        }
        return "Deletion by param";
    }

    @Override
    public String getStat(String drzava, String datumOd, String datumDo) {
        LocalDate d1=LocalDate.parse(datumOd,formatter);
        LocalDate d2=LocalDate.parse(datumOd,formatter);
        int idDrzava=countryService.getByImeDrzava(drzava).getId();
        Set<SearchDto> searchData= searchService.getByParams(idDrzava,datumOd,datumDo);
        SearchDto priv = new SearchDto();
        priv.setIdDrzava(idDrzava);
        priv.setDatumDo(d2);
        priv.setDatumOd(d1);
        searchService.save(priv);
        int idPretraga = searchService.getLastInsertedId().getId();
        SearchResultDto resultDto = new SearchResultDto(idPretraga);
        StatisticsDto statisticsDto = new StatisticsDto(idPretraga);
        Set<LocalDate> dani = new HashSet<>();
        dani.add(d1);
        dani.add(d2);
        LocalDate countDate=d1.plusDays(1);
        LocalDate before;
        while(countDate.isBefore(d2)){
            dani.add(countDate);
            countDate=countDate.plusDays(1);
        }
        if(searchData.size()!=0){

        }else{
            for(LocalDate d : dani){
                before=d.minusDays(1);
            }
        }
    }
}
