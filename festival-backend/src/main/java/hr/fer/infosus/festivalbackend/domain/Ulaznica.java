package hr.fer.infosus.festivalbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Ulaznica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private Long cijena;

    @JoinColumn(name = "dogadaj_id")
    @ManyToOne
    private Dogadaj dogadaj;

    @JoinColumn(name = "kupac_id")
    @ManyToOne
    private VanjskiKorisnik kupac;
}
