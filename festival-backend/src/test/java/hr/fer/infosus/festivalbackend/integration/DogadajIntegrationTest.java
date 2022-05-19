package hr.fer.infosus.festivalbackend.integration;

import hr.fer.infosus.festivalbackend.BaseIntegrationTest;
import hr.fer.infosus.festivalbackend.domain.Dogadaj;
import hr.fer.infosus.festivalbackend.domain.Mjesto;
import hr.fer.infosus.festivalbackend.repository.DogadajRepository;
import hr.fer.infosus.festivalbackend.repository.MjestoRepository;
import hr.fer.infosus.festivalbackend.web.rest.dto.DogadajDto;
import hr.fer.infosus.festivalbackend.web.rest.dto.MjestoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class DogadajIntegrationTest extends BaseIntegrationTest {

    @Autowired
    private DogadajRepository dogadajRepository;
    @Autowired
    private MjestoRepository mjestoRepository;

    @Test
    void getDogadaj() throws Exception {
        Mjesto mjesto = mjestoRepository.save(Mjesto.builder().naziv("Zagreb").postanskiBroj(10000).build());

        Dogadaj dogadaj = dogadajRepository.save(Dogadaj.builder()
                .brojUlaznica(5261)
                .datumPocetka(LocalDate.of(2022, 12, 2))
                .naziv("Lijep Festival")
                .trajanjeDani(2)
                .mjesto(mjesto)
                .build());

        DogadajDto dogadajDto = DogadajDto.builder()
                .brojUlaznica(5261)
                .datumPocetka(LocalDate.of(2022, 12, 2))
                .naziv("Lijep Festival")
                .trajanjeDani(2)
                .mjesto(mjesto)
                .build();

        mockMvc.perform(get("/api/v1/dogadaj/" + dogadaj.getId())
                        .contentType(APPLICATION_JSON)
                        .content(mapper.writeValueAsString(dogadajDto)))
                .andExpect(status().is2xxSuccessful());

        Dogadaj dogadajRes = dogadajRepository.getById(dogadaj.getId());

        assertEquals(dogadajRes.getNaziv(), dogadajDto.getNaziv());
    }

    @Test
    void deleteDogadaj() throws Exception {
        Mjesto mjesto = mjestoRepository.save(Mjesto.builder().naziv("Zagreb").postanskiBroj(10000).build());

        Dogadaj dogadaj = dogadajRepository.save(Dogadaj.builder()
                .brojUlaznica(5261)
                .datumPocetka(LocalDate.of(2022, 12, 2))
                .naziv("Lijep Festival")
                .trajanjeDani(2)
                .mjesto(mjesto)
                .build());

        mockMvc.perform(delete("/api/v1/dogadaj/" + dogadaj.getId())
                        .contentType(APPLICATION_JSON)
                        .content(mapper.writeValueAsString(dogadaj)))
                .andExpect(status().is2xxSuccessful());

        Dogadaj dogadajRes = dogadajRepository.getById(dogadaj.getId());

        assertEquals(dogadajRes, null);
    }

}
