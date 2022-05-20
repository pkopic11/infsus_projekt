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
    public void update(DogadajDto editDogadaj) throws Exception {
        Dogadaj d = dogadajRepository.getById(editDogadaj.getId());
        if(editDogadaj.getDatumPocetka() != null)
            d.setDatumPocetka(editDogadaj.getDatumPocetka());

        if(editDogadaj.getMjesto() != null)
            d.setMjesto(editDogadaj.getMjesto());

        if(editDogadaj.getNaziv() != null)
            d.setNaziv(editDogadaj.getNaziv());

        if(editDogadaj.getTrajanjeDani() != null)
            d.setTrajanjeDani(editDogadaj.getTrajanjeDani());

        dogadajRepository.save(d);
    }
}
