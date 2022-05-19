package hr.fer.infosus.festivalbackend.service;

import hr.fer.infosus.festivalbackend.domain.*;
import hr.fer.infosus.festivalbackend.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static java.util.List.of;


@Service
@RequiredArgsConstructor
public class DataLoadService implements ApplicationRunner {

    private final VanjskiKorisnikRepository vanjskiKorisnikRepository;
    private final AdministratorRepository administratorRepository;
    private final IzdavackaKucaRepository izdavackaKucaRepository;
    private final MjestoRepository mjestoRepository;
    private final MenadzerRepository menadzerRepository;
    private final IzvodacRepository izvodacRepository;
    private final DogadajRepository dogadajRepository;
    private final DogadajIzvodacEntityRepository dogadajIzvodacRepository;
    private final DogadajOrganizatorEntityRepository dogadajOrganizatorRepository;

    @Override
    public void run(ApplicationArguments args) {

        if (vanjskiKorisnikRepository.findAll().size() == 0) {
            generirajKorisnike();
        }
        if (administratorRepository.findAll().size() == 0) {
            generirajAdministratore();
        }
        if (mjestoRepository.findAll().size() == 0) {
            generirajMjesta();
        }
        if (izdavackaKucaRepository.findAll().size() == 0) {
            generirajIzdavackeKuce();
        }
        if (menadzerRepository.findAll().size() == 0) {
            generirajMenadzere();
        }
        if (izvodacRepository.findAll().size() == 0) {
            generirajIzvodace();
        }
        if (dogadajRepository.findAll().size() == 0) {
            generirajDogadaje();
        }
    }

    private void generirajAdministratore() {
        administratorRepository.saveAll(of(
                Administrator.builder().email("admin1@email.com" ).password("admin").build(),
                Administrator.builder().email("admin2@email.com" ).password("admin").build(),
                Administrator.builder().email("admin3@email.com" ).password("admin").build()
        ));
    }

    private void generirajKorisnike() {
        vanjskiKorisnikRepository.saveAll(of(
                VanjskiKorisnik.builder().ime("Josko").prezime("Topovicevic").build(),
                VanjskiKorisnik.builder().ime("Davorin").prezime("Stanic").build(),
                VanjskiKorisnik.builder().ime("Stanislav").prezime("Kokot").build()
        ));
    }

    private void generirajMjesta() {
        mjestoRepository.saveAll(of(
                Mjesto.builder().naziv("Zagreb").postanskiBroj(10000).build(),
                Mjesto.builder().naziv("Osijek").postanskiBroj(31000).build(),
                Mjesto.builder().naziv("Split").postanskiBroj(21000).build()
        ));
    }

    private void generirajIzdavackeKuce() {
        Mjesto m1 = mjestoRepository.findAll().get(0);
        Mjesto m2 = mjestoRepository.findAll().get(1);
        Mjesto m3 = mjestoRepository.findAll().get(2);
        izdavackaKucaRepository.saveAll(of(
                IzdavackaKuca.builder().naziv("Izdavaci").mjesto(m1).build(),
                IzdavackaKuca.builder().naziv("FERecords").mjesto(m2).build(),
                IzdavackaKuca.builder().naziv("Moje pjesme moji snovi").mjesto(m3).build()
        ));
    }

    private void generirajIzvodace() {
        izvodacRepository.saveAll(of(
                Izvodac.builder().ime("Pero").prezime("Horvat").umjetnickoIme("Umjetnik").build(),
                Izvodac.builder().ime("Ivan").prezime("Jozic").umjetnickoIme("Perica").build(),
                Izvodac.builder().ime("Jovan").prezime("Ivanic").umjetnickoIme("Crni Joso").build(),
                Izvodac.builder().ime("Lovro").prezime("Lovric").umjetnickoIme("Lovorko").build()
        ));
    }

    private void generirajMenadzere() {
        menadzerRepository.saveAll(of(
                Menadzer.builder().ime("Opasni").prezime("Menadzer").build(),
                Menadzer.builder().ime("Toni").prezime("Makaroni").build(),
                Menadzer.builder().ime("Vito").prezime("Corleone").build(),
                Menadzer.builder().ime("menadzerIme4").prezime("menadzerPrezime4").build()
        ));
    }

    private void generirajDogadaje() {
        Mjesto m1 = mjestoRepository.findAll().get(0);
        Mjesto m2 = mjestoRepository.findAll().get(1);
        Mjesto m3 = mjestoRepository.findAll().get(2);

        Dogadaj d1 =  Dogadaj.builder()
                .brojUlaznica(5261)
                .datumPocetka(LocalDate.of(2022, 12, 2))
                .naziv("Lijep Festival")
                .trajanjeDani(2)
                .mjesto(m1)
                .build();

        Dogadaj d2 = Dogadaj.builder()
                .brojUlaznica(25261)
                .datumPocetka(LocalDate.of(2023, 06, 12))
                .naziv("Drugi lijepi Festival")
                .trajanjeDani(5)
                .mjesto(m2)
                .build();

        Dogadaj d3 = Dogadaj.builder()
                .brojUlaznica(7654)
                .datumPocetka(LocalDate.of(2020, 01, 16))
                .naziv("Stvarno dobar Festival")
                .trajanjeDani(3)
                .mjesto(m3)
                .build();

        dogadajRepository.saveAll(of(d1, d2, d3));
    }

    private void dodajOrganizatoreiIzvodace(){
        Izvodac i1 = izvodacRepository.findAll().get(0);
        Izvodac i2 = izvodacRepository.findAll().get(1);
        Izvodac i3 = izvodacRepository.findAll().get(2);
        Izvodac i4 = izvodacRepository.findAll().get(3);

        Menadzer men1 = menadzerRepository.findAll().get(0);
        Menadzer men2 = menadzerRepository.findAll().get(1);
        Menadzer men3 = menadzerRepository.findAll().get(2);

        Dogadaj d1 =  dogadajRepository.findAll().get(0);
        Dogadaj d2 =  dogadajRepository.findAll().get(1);
        Dogadaj d3 =  dogadajRepository.findAll().get(2);

        DogadajOrganizator dogadajOrganizator = new DogadajOrganizator(d1.getId(), men1.getId());
        DogadajOrganizatorEntity dogadajOrganizatorEntity = new DogadajOrganizatorEntity(dogadajOrganizator);
        dogadajOrganizatorRepository.save(dogadajOrganizatorEntity);
    }
}
