package hr.fer.infosus.festivalbackend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class VanjskiKorisnik{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column
    private String ime;

    @Column
    private String prezime;
}
