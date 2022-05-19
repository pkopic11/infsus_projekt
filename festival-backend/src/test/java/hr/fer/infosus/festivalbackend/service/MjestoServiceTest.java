package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.Mjesto;
import hr.fer.infosus.festivalbackend.repository.MjestoRepository;
import hr.fer.infosus.festivalbackend.web.rest.dto.MjestoDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MjestoServiceTest {

    @Mock
    private Mjesto mjesto;
    @Mock
    private MjestoDto mjestoDto;

    @Mock
    private MjestoRepository mjestoRepository;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private MjestoService mjestoService;

    @Test
    void findMjesto() {
        when(mjestoRepository.findById(mjesto.getId())).thenReturn(Optional.of(mjesto));
        when(modelMapper.map(mjestoRepository.findById(mjesto.getId()).get(), MjestoDto.class)).thenReturn(mjestoDto);

        mjestoService.findById(mjesto.getId());

        verify(mjestoRepository, atLeastOnce()).findById(mjesto.getId());
    }


}
