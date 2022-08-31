package com.ben.scheduler;

import com.ben.dto.CountriesDto;
import com.ben.dto.mapper.CountriesDtoMapper;
import com.ben.entity.mapper.CountriesEntityDtoMapper;
import com.ben.repository.CountryDao;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class FillCountryTable {

    private final CountryDao countryDao;
    private final CountriesEntityDtoMapper countriesDtoMapper;
    public FillCountryTable(CountryDao countryDao,CountriesEntityDtoMapper countriesDtoMapper){
        this.countryDao=countryDao;
        this.countriesDtoMapper=countriesDtoMapper;
    }

    @Scheduled(cron = "0 0 * ? * *")
    private void fillTheCountryTable(){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://covid-193.p.rapidapi.com/countries")
                .get()
                .addHeader("X-RapidAPI-Key", "656614c3fcmshe363f03b9fe4e99p174e29jsna34bab990c3a")
                .addHeader("X-RapidAPI-Host", "covid-193.p.rapidapi.com")
                .build();
        Response response=null;
        JsonNode node;
        Set<CountriesDto> data;
        try{
            response = client.newCall(request).execute();
            ObjectMapper mapper = new ObjectMapper();
             node= mapper.readTree(response.body().string());
            ObjectReader reader = mapper.readerFor(new TypeReference<Set<CountriesDto>>() {
            });
            data=reader.readValue(node.get("response"));
            countryDao.saveAll(data.stream().map(countriesDtoMapper).collect(Collectors.toSet()));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
