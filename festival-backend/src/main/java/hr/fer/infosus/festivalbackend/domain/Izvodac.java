package hr.fer.infosus.festivalbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
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
    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Set<Dogadaj> dogadaji;
}
