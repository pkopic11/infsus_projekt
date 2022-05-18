package hr.fer.infosus.festivalbackend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Menadzer{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String ime;

    @Column
    private String prezime;
}

