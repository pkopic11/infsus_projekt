package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.Dogadaj;
import hr.fer.infosus.festivalbackend.repository.DogadajRepository;
import hr.fer.infosus.festivalbackend.repository.MjestoRepository;
import hr.fer.infosus.festivalbackend.web.rest.dto.DogadajDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DogadajService {

    DogadajRepository dogadajRepository;
    MjestoRepository mjestoRepository;
    ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<DogadajDto> findAll(){
        return dogadajRepository.findAll().stream().map(dogadaj -> modelMapper.map(dogadaj, DogadajDto.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public DogadajDto findById(Long id){
        return modelMapper.map(dogadajRepository.findById(id).get(), DogadajDto.class);
    }

    @Transactional
    public void save(DogadajDto dogadajDto){
        dogadajRepository.save(modelMapper.map(dogadajDto, Dogadaj.class));
    }

    @Transactional
    public void delete(Long id){
        dogadajRepository.deleteById(id);
    }

    @Transactional
    public void update(Dogadaj editDogadaj) throws Exception {
        var dogadaj = dogadajRepository.findById(editDogadaj.getId()).orElseThrow(() -> new Exception());
        var mjesto = mjestoRepository.findById(dogadaj.getMjesto().getId()).orElseThrow(() -> new Exception());

        modelMapper.map(editDogadaj, dogadaj);
        dogadaj.setMjesto(mjesto);
        dogadajRepository.save(dogadaj);
    }
}
