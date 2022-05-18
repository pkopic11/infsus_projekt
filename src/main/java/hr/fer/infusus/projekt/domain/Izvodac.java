package hr.fer.infusus.projekt.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Data
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
    private Set<Dogadaj> dogadaji;
}
