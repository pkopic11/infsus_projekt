package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.Dogadaj;
import hr.fer.infosus.festivalbackend.repository.DogadajRepository;
import hr.fer.infosus.festivalbackend.web.rest.dto.DogadajDto;
import hr.fer.infosus.festivalbackend.web.rest.dto.MjestoDto;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DogadajServiceTest {

    @Mock
    Dogadaj dogadaj;
    @Mock
    DogadajDto dogadajDto;

    @Mock
    DogadajRepository dogadajRepository;

    @Mock
    ModelMapper modelMapper;

    @InjectMocks
    DogadajService dogadajService;

    @Test
    void findDogadaj() {
        when(dogadajRepository.findById(dogadaj.getId())).thenReturn(Optional.of(dogadaj));
        when(modelMapper.map(dogadajRepository.findById(dogadaj.getId()).get(), DogadajDto.class)).thenReturn(dogadajDto);

        dogadajService.findById(dogadaj.getId());

        verify(dogadajRepository, atLeastOnce()).findById(dogadaj.getId());
    }

}
