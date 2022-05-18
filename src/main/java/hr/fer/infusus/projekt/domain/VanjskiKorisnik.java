package hr.fer.infusus.projekt.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;

@EqualsAndHashCode(callSuper = true)
@Data
public class VanjskiKorisnik extends Korisnik{

    @Column
    private String ime;

    @Column
    private String prezime;
}
