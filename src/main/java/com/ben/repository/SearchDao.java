package com.ben.repository;

import com.ben.entity.Search;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface SearchDao extends JpaRepository<Search, Long> {
    List<Search> findAllById(int id);

    @Query(value = "select * from pretraga where datumOd=:d1 and datumDo=:d2",nativeQuery = true)
    List<Search> findAllByDate(@Param("d1") String d1,@Param("d2") String d2);
    @Query(value = "select * from pretraga where idDrzava=:idDrzava",nativeQuery=true)
    Set<Search> findAllByIdDrzava(@Param("idDrzava") int idDrzava);
    @Modifying
    @Query(value = "DELETE FROM pretraga WHERE iddrzava=:idDrzava and datumod=:datumOd and datumdo=:datumDo",nativeQuery = true)
    void deleteByParam(@Param("idDrzava")int idDrzava,@Param("datumOd")String datumOd,@Param("datumDo") String datumDo);
    @Query(value = "select * FROM pretraga where idDrzava=:idDrzava and (datumOd>=:datumOd and datumDo<=:datumDo)",nativeQuery = true)
    Set<Search> getByParameters(@Param("idDrzava")int idDrzava,@Param("datumOd")String datumOd,@Param("datumDo") String datumDo);
    @Query(value="select * from pretraga where id=(SELECT LAST_INSERT_ID() from pretraga)",nativeQuery = true)
    Search getLastInsertedId();

}
