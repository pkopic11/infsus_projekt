package hr.fer.infosus.festivalbackend.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@RequiredArgsConstructor
public class IzdavackaKuca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @Column
    private String naziv;

    @JoinColumn
    @ManyToOne
    private Mjesto mjesto;
}
