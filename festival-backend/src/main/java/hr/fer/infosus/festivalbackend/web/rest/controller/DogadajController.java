package hr.fer.infosus.festivalbackend.web.rest.controller;

import hr.fer.infosus.festivalbackend.service.DogadajService;
import hr.fer.infosus.festivalbackend.web.rest.dto.DogadajDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/dogadaj")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DogadajController {

    DogadajService dogadajService;


    @GetMapping("/all")
    public List<DogadajDto> findAll(){
        return dogadajService.findAll();
    }

    @GetMapping("/{id}")
    public DogadajDto findById(@PathVariable Long id){
        return dogadajService.findById(id);
    }

    @PostMapping
    public void save(@Valid @RequestBody DogadajDto dogadajDto){
        dogadajService.save(dogadajDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        dogadajService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody DogadajDto dogadaj) throws Exception {
        dogadajService.update(dogadaj);
    }
}
