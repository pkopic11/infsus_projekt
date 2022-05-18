package hr.fer.infosus.festivalbackend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class IzdavackaKuca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @Column
    private String naziv;

    @JoinColumn
    @ManyToOne
    private Mjesto mjesto;
}
