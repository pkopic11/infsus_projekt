package hr.fer.infusus.projekt.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
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
