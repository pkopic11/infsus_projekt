package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.Dogadaj;
import hr.fer.infosus.festivalbackend.repository.DogadajRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DogadajService {

    DogadajRepository dogadajRepository;

    @Transactional(readOnly = true)
    public List<Dogadaj> findAll(){
        return dogadajRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Dogadaj> findById(Long id){
        return dogadajRepository.findById(id);
    }

    @Transactional
    public void save(Dogadaj dogadaj){
        dogadajRepository.save(dogadaj);
    }

    @Transactional
    public void delete(Long id){
        dogadajRepository.deleteById(id);
    }

}
