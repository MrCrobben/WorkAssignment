package com.ben.service.impl;

import com.ben.dto.SearchResultDto;
import com.ben.dto.mapper.SearchResultDtoMapper;
import com.ben.repository.SearchResultDao;
import com.ben.service.SearchResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
@Service
public class SearchResultServiceImpl implements SearchResultService {

    private final SearchResultDao searchResultDao;
    private final SearchResultDtoMapper searchResultDtoMapper;

    @Autowired
    public SearchResultServiceImpl(SearchResultDao searchResultDao,SearchResultDtoMapper searchResultDtoMapper){
        this.searchResultDao=searchResultDao;
        this.searchResultDtoMapper=searchResultDtoMapper;
    }
    @Override
    public Set<SearchResultDto> getSearchResultsByIdPretraga(int idPretraga) {
        return searchResultDao.getAllByIdPretraga(idPretraga).stream().map(searchResultDtoMapper).collect(Collectors.toSet());
    }

    @Override
    public void deleteAll() {
        searchResultDao.deleteAll();
    }
}
