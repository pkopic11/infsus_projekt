package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.Mjesto;
import hr.fer.infosus.festivalbackend.repository.MjestoRepository;
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
public class MjestoService {

    MjestoRepository mjestoRepository;

    @Transactional(readOnly = true)
    public List<Mjesto> findAll(){
        return mjestoRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Mjesto> findById(Long id){
        return mjestoRepository.findById(id);
    }

    @Transactional
    public void save(Mjesto mjesto){
        mjestoRepository.save(mjesto);
    }

    @Transactional
    public void delete(Long id){
        mjestoRepository.deleteById(id);
    }
}
