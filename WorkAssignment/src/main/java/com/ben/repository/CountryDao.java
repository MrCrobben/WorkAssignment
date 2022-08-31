package com.ben.repository;

import com.ben.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryDao extends JpaRepository<Countries, Long> {

    Countries getById(int id);
}
