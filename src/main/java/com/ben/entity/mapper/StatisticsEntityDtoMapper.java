package com.ben.entity.mapper;

import com.ben.dto.StatisticsDto;
import com.ben.entity.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.function.Function;
@Component
public class StatisticsEntityDtoMapper implements Function<StatisticsDto, Statistics> {
    public Statistics apply(StatisticsDto statisticsDto) {
        Statistics st = new Statistics();
        st.setId(statisticsDto.getId());
        st.setIdPretraga(st.getIdPretraga());
        st.setNoviSlucajevi(statisticsDto.getNoviSlucajevi());
        st.setAktivniSlucajevi(statisticsDto.getAktivniSlucajevi());
        st.setKriticniSlucajevi(statisticsDto.getKriticniSlucajevi());
        st.setOporavljeni(statisticsDto.getOporavljeni());

        return st;
    }
}
