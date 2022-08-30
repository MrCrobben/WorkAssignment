package com.ben.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
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
    private int idDrzava;

    @NotEmpty
    @Temporal(TemporalType.DATE)
    private Date datumOd;

    @NotEmpty
    @Temporal(TemporalType.DATE)
    private Date datumDo;
}
