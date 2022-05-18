package hr.fer.infusus.projekt.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Izvodac {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String ime;

    @Column
    private String prezime;

    @Column
    private String umjetnickoIme;

    @Column
    @ManyToMany
    private Set<Dogadaj> dogadaji;
}
