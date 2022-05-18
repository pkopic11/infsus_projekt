package hr.fer.infosus.festivalbackend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Administrator{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String email;

    @Column
    private String password;
}
