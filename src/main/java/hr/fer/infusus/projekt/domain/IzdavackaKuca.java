package hr.fer.infusus.projekt.domain;

import lombok.Data;

import javax.persistence.*;

@Data
public class IzdavackaKuca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String naziv;

    @JoinColumn(name = "mjesto_id")
    @ManyToOne
    private Mjesto mjesto;
}
