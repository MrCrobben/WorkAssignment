package com.ben.repository;

import com.ben.entity.Search;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;

@Repository
public interface SearchDao extends JpaRepository<Search, Long> {
    List<Search> findAllById(int id);

    @Query(value = "select * from pretraga where datumOd=:d1 and datumDo=:d2",nativeQuery = true)
    List<Search> findAllByDate(@Param("d1") String d1,@Param("d2") String d2);

}
