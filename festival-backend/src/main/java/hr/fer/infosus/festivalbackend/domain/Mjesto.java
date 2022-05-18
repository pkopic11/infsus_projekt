package hr.fer.infosus.festivalbackend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Mjesto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String naziv;

    @Column
    private Integer postanskiBroj;
}
