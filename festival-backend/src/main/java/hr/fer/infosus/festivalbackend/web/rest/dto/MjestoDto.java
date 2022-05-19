package hr.fer.infosus.festivalbackend.web.rest.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MjestoDto {
    Long id;
    @NotBlank
    String naziv;
    Integer postanskiBroj;
}
