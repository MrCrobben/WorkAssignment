package com.ben.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Table(name = "pretraga")
@Entity
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Column(name = "iddrzava")
    private int idDrzava;

    @NotEmpty
    @Column(name = "datumod")
    private LocalDate datumOd;

    @NotEmpty
    @Column(name = "datumdo")
    private LocalDate datumDo;
}
