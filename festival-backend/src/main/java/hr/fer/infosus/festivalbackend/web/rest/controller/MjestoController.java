package hr.fer.infosus.festivalbackend.web.rest.controller;

import hr.fer.infosus.festivalbackend.service.MjestoService;
import hr.fer.infosus.festivalbackend.web.rest.dto.MjestoDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/mjesto")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MjestoController {

    MjestoService mjestoService;


    @PostMapping
    public void save(@RequestBody MjestoDto mjestoDto){
        mjestoService.save(mjestoDto);
    }

    @GetMapping("/all")
    public List<MjestoDto> findAll(){
        return mjestoService.findAll();
    }

}
