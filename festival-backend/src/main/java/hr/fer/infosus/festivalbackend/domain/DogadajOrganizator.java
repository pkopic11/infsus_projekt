package hr.fer.infosus.festivalbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "dogadaj_organizatori")
public class DogadajOrganizator implements Serializable {

    @Column(name = "dogadaj_id")
    private Long dogadajId;

    @Column(name = "organizator_id")
    private Long organizatorId;
}
