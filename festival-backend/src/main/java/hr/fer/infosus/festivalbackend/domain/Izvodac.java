package hr.fer.infosus.festivalbackend.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@RequiredArgsConstructor
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
