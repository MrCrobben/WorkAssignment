package com.ben.service.impl;

import com.ben.dto.StatisticsDto;
import com.ben.dto.mapper.StatisticsDtoMapper;
import com.ben.repository.StatisticsDao;
import com.ben.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private final StatisticsDao statisticsDao;
    private final StatisticsDtoMapper statisticsDtoMapper;
    @Autowired
    public StatisticsServiceImpl(StatisticsDao statisticsDao,StatisticsDtoMapper statisticsDtoMapper){
        this.statisticsDao=statisticsDao;
        this.statisticsDtoMapper=statisticsDtoMapper;
    }
    @Override
    public Set<StatisticsDto> getStatisticsByIdPretraga(int idPretraga) {
        return statisticsDao.getAllByIdPretraga(idPretraga).stream().map(statisticsDtoMapper).collect(Collectors.toSet());
    }

    @Override
    public void deleteAll() {
        statisticsDao.deleteAll();
    }
}
