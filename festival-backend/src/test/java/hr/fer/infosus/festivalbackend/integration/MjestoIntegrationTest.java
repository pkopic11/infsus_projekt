package hr.fer.infosus.festivalbackend.integration;

import hr.fer.infosus.festivalbackend.BaseIntegrationTest;
import hr.fer.infosus.festivalbackend.domain.Mjesto;
import hr.fer.infosus.festivalbackend.repository.MjestoRepository;
import hr.fer.infosus.festivalbackend.web.rest.dto.MjestoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MjestoIntegrationTest extends BaseIntegrationTest {

    @Autowired
    private MjestoRepository mjestoRepository;

    @Test
    void getMjesto() throws Exception {
        Mjesto mjesto = mjestoRepository.save(Mjesto.builder().naziv("Zagreb").postanskiBroj(10000).build());
        MjestoDto mjestoDto = MjestoDto.builder().naziv("Zagreb").postanskiBroj(10000).build();

        mockMvc.perform(get("/api/v1/mjesto/" + mjesto.getId())
                .contentType(APPLICATION_JSON)
                .content(mapper.writeValueAsString(mjestoDto)))
                .andExpect(status().is2xxSuccessful());

        Mjesto mjestoRes = mjestoRepository.getById(mjesto.getId());

        assertEquals(mjestoRes.getNaziv(), mjestoDto.getNaziv());
    }
}
