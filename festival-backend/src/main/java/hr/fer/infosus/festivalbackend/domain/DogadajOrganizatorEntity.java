package hr.fer.infosus.festivalbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class DogadajOrganizatorEntity implements Serializable {

    @EmbeddedId
    private DogadajOrganizator dogadajOrganizator;

    public DogadajOrganizatorEntity(Long d1Id, Long men1Id) {
        this.dogadajOrganizator = new DogadajOrganizator(d1Id, men1Id);
    }
}
