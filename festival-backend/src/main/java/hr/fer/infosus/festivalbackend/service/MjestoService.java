package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.Mjesto;
import hr.fer.infosus.festivalbackend.repository.MjestoRepository;
import hr.fer.infosus.festivalbackend.web.rest.dto.MjestoDto;
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
public class MjestoService {

    MjestoRepository mjestoRepository;
    ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<MjestoDto> findAll(){
        return mjestoRepository.findAll().stream().map(mjesto -> modelMapper.map(mjesto, MjestoDto.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Mjesto> findById(Long id){
        return mjestoRepository.findById(id);
    }

    @Transactional
    public void save(MjestoDto mjestoDto){
        mjestoRepository.save(modelMapper.map(mjestoDto, Mjesto.class));
    }

    @Transactional
    public void delete(Long id){
        mjestoRepository.deleteById(id);
    }
}
