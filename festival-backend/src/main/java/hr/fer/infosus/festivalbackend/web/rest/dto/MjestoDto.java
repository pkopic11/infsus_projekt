package hr.fer.infosus.festivalbackend.web.rest.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MjestoDto {
    Long id;
    @NotBlank
    String naziv;
    Integer postanskiBroj;
}
