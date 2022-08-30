package com.ben.dto.mapper;

import com.ben.dto.StatisticsDto;
import com.ben.entity.Statistics;
import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class StatisticsDtoMapper implements Function<Statistics, StatisticsDto> {
    @Override
    public StatisticsDto apply(Statistics statistics) {
        if(statistics == null){
            return null;
        }
        StatisticsDto statDto = new StatisticsDto();
        statDto.setId(statistics.getId());
        statDto.setIdPretraga(statistics.getIdPretraga());
        statDto.setNoviSlucajevi(statistics.getNoviSlucajevi());
        statDto.setAktivniSlucajevi(statistics.getAktivniSlucajevi());
        statDto.setKriticniSlucajevi(statistics.getKriticniSlucajevi());
        statDto.setOporavljeni(statistics.getOporavljeni());
        return statDto;
    }
}
