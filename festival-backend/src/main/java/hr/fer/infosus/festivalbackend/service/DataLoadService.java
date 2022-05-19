package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

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


    }

    private void generirajKorisnike() {


    }

    private void generirajIzdavackeKuce() {


    }

    private void generirajMjesta() {


    }

    private void generirajIzvodace() {


    }

    private void generirajMenadzere() {


    }
}
