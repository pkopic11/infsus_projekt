package hr.fer.infosus.festivalbackend.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
public class Mjesto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String naziv;

    private Integer postanskiBroj;
}
