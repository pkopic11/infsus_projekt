package hr.fer.infosus.festivalbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class DogadajIzvodacEntity implements Serializable {

    @EmbeddedId
    private DogadajIzvodac dogadajIzvodac;
}
