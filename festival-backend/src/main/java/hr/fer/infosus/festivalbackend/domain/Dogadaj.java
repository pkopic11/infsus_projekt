package hr.fer.infosus.festivalbackend.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Builder
@RequiredArgsConstructor
public class Dogadaj {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String naziv;

    @Column
    private Integer trajanjeDani;

    @Column
    private Integer brojUlaznica;

    @Column
    private LocalDate datumPocetka;

    @JoinColumn(name = "mjesto_id")
    @ManyToOne
    private Mjesto mjesto;

    @Column
    @ManyToMany
    private Set<Izvodac> izvodaci;

    @Column
    @ManyToMany
    private Set<Menadzer> organizatori;
}
