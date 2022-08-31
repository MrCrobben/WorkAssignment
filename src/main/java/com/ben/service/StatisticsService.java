package com.ben.service;

import com.ben.dto.StatisticsDto;

import java.util.Set;
public interface StatisticsService {

    Set<StatisticsDto> getStatisticsByIdPretraga(int idPretraga);
    void deleteAll();
}
