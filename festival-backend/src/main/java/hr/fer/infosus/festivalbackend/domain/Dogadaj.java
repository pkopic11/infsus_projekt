package hr.fer.infosus.festivalbackend.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
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
    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Set<Izvodac> izvodaci;

    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Menadzer> organizatori;
}
