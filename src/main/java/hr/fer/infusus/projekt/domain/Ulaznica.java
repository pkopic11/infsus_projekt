package hr.fer.infusus.projekt.domain;

import lombok.Data;

import javax.persistence.*;

@Data
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
