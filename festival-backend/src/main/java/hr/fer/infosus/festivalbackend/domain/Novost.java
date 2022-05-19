package hr.fer.infosus.festivalbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Novost {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String naslov;

    @Column
    private String tekst;

    @Column
    private LocalDate datumObjave;

    @JoinColumn(name = "menadzer_id")
    @ManyToOne
    private Menadzer menadzer;
}
