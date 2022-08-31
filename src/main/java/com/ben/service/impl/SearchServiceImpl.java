package com.ben.service.impl;

import com.ben.dto.GenericDto;
import com.ben.dto.SearchDto;
import com.ben.dto.mapper.SearchDtoMapper;
import com.ben.entity.Search;
import com.ben.entity.mapper.SearchEntityDtoMapper;
import com.ben.repository.SearchDao;
import com.ben.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
@Service
public class SearchServiceImpl implements SearchService {

    private final SearchDao searchDao;

    private final SearchDtoMapper searchDtoMapper;
    private final SearchEntityDtoMapper searchEntityDtoMapper;

    @Autowired
    public SearchServiceImpl(SearchDao searchDao,
                             SearchDtoMapper searchDtoMapper,
                             SearchEntityDtoMapper searchEntityDtoMapper){
        this.searchEntityDtoMapper=searchEntityDtoMapper;
        this.searchDao=searchDao;
        this.searchDtoMapper=searchDtoMapper;
    }

    @Override
    public Set<SearchDto> getSearchByIdDrzava(int idDrzava) {
        GenericDto<Set<Search>> data = new GenericDto<>();
        data.setPayload(searchDao.findAllByIdDrzava(idDrzava));
        return data.getPayload().stream().map(searchDtoMapper).collect(Collectors.toSet());
    }

    @Override
    @Transactional
    public void deleteByParameters(int idDrzava, LocalDate datumOd, LocalDate datumDo) {
        searchDao.deleteByParam(idDrzava,datumOd.toString(),datumDo.toString());
    }

    @Override
    public Set<SearchDto> getByParams(int idDrzava, String datumOd, String datumDo) {
        GenericDto<Set<Search>> data = new GenericDto<>();
        data.setPayload(searchDao.getByParameters(idDrzava,datumOd,datumDo));
        return data.getPayload().stream().map(searchDtoMapper).collect(Collectors.toSet());
    }

    @Override
    public void save(SearchDto search) {
        searchDao.save(searchEntityDtoMapper.apply(search));
    }

    @Override
    public SearchDto getLastInsertedId() {
        GenericDto<Search> data = new GenericDto<>();
        data.setPayload(searchDao.getLastInsertedId());
        return searchDtoMapper.apply(data.getPayload());
    }

    public void deleteAll(){
        searchDao.deleteAll();
    }
}
