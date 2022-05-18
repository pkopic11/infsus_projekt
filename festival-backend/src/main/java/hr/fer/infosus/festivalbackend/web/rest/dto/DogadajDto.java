package hr.fer.infosus.festivalbackend.web.rest.dto;

import hr.fer.infosus.festivalbackend.domain.Mjesto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DogadajDto {
    Long id;
    String naziv;
    Integer trajanjeDani;
    Integer brojUlaznica;
    LocalDate datumPocetka;
    Mjesto mjesto;
}
