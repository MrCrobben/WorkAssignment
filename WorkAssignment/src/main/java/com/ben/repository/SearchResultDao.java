package com.ben.repository;

import com.ben.entity.Search;
import com.ben.entity.SearchResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchResultDao extends JpaRepository<SearchResult, Long> {

    List<SearchResult> getAllByIdPretraga(int idPretraga);
}
