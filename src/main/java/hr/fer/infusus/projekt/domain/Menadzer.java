package hr.fer.infusus.projekt.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
public class Menadzer{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String ime;

    @Column
    private String prezime;
}

