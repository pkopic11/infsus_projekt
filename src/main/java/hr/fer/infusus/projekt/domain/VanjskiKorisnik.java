package hr.fer.infusus.projekt.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
