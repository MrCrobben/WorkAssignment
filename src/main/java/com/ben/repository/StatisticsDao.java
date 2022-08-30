package com.ben.repository;

import com.ben.entity.Search;
import com.ben.entity.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatisticsDao extends JpaRepository<Statistics, Long> {
    List<Statistics> getAllByIdPretraga(int idPretraga);
}
