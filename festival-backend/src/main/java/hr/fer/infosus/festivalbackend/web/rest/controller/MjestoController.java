package hr.fer.infosus.festivalbackend.web.rest.controller;

import hr.fer.infosus.festivalbackend.domain.Mjesto;
import hr.fer.infosus.festivalbackend.service.MjestoService;
import hr.fer.infosus.festivalbackend.web.rest.dto.MjestoDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/mjesto")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MjestoController {

    MjestoService mjestoService;
    ModelMapper modelMapper;

    @PostMapping
    public void save(@RequestBody MjestoDto mjestoDto){
        mjestoService.save(modelMapper.map(mjestoDto, Mjesto.class));
    }


}
