package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.Administrator;
import hr.fer.infosus.festivalbackend.domain.Mjesto;
import hr.fer.infosus.festivalbackend.domain.VanjskiKorisnik;
import hr.fer.infosus.festivalbackend.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DataLoadService implements ApplicationRunner {

    private final VanjskiKorisnikRepository vanjskiKorisnikRepository;
    private final AdministratorRepository administratorRepository;
    private final IzdavackaKucaRepository izdavackaKucaRepository;
    private final MjestoRepository mjestoRepository;
    private final MenadzerRepository menadzerRepository;
    private final IzvodacRepository izvodacRepository;

    @Override
    public void run(ApplicationArguments args) {

        if (vanjskiKorisnikRepository.findAll().size() == 0) {
            generirajKorisnike();
        }
        if (administratorRepository.findAll().size() == 0) {
            generirajAdministratore();
        }
        if (izdavackaKucaRepository.findAll().size() == 0) {
            generirajIzdavackeKuce();
        }
        if (mjestoRepository.findAll().size() == 0) {
            generirajMjesta();
        }
        if (menadzerRepository.findAll().size() == 0) {
            generirajMenadzere();
        }
        if (izvodacRepository.findAll().size() == 0) {
            generirajIzvodace();
        }
    }

    private void generirajAdministratore() {
        administratorRepository.saveAll(List.of(
                Administrator.builder().email("admin1@email.com" ).password("admin").build(),
                Administrator.builder().email("admin2@email.com" ).password("admin").build(),
                Administrator.builder().email("admin3@email.com" ).password("admin").build()
        ));
    }

    private void generirajKorisnike() {
        vanjskiKorisnikRepository.saveAll(List.of(
                VanjskiKorisnik.builder().ime("ime1").prezime("prezime1").build(),
                VanjskiKorisnik.builder().ime("ime2").prezime("prezime2").build(),
                VanjskiKorisnik.builder().ime("ime3").prezime("prezime3").build()
        ));
    }

    private void generirajIzdavackeKuce() {


    }

    private void generirajMjesta() {
        mjestoRepository.saveAll(List.of(
            Mjesto.builder().naziv("Zagreb").postanskiBroj(10000).build(),
            Mjesto.builder().naziv("Osijek").postanskiBroj(31000).build(),
            Mjesto.builder().naziv("Split").postanskiBroj(21000).build()
        ));
    }

    private void generirajIzvodace() {


    }

    private void generirajMenadzere() {


    }
}
