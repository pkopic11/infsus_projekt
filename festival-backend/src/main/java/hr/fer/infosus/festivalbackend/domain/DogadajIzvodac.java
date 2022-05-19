package hr.fer.infosus.festivalbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class DogadajIzvodac implements Serializable {

    @Column(name = "dogadaj_id")
    private Long dogadajId;

    @Column(name = "izvodac_id")
    private Long izvodacId;
}
