package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.Dogadaj;
import hr.fer.infosus.festivalbackend.repository.DogadajRepository;
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

}
