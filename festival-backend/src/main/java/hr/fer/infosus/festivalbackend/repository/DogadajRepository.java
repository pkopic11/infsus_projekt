package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.Dogadaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface DogadajRepository extends JpaRepository<Dogadaj, Long> {

    @Query(value = "insert into dogadaj(id, datum_pocetka, naziv, trajanje_dani, mjesto_id)" +
            "values (:dogadajId, :datumPocetka, :naziv, :trajanje, :mjestoId)", nativeQuery = true)
    Long dodajDogadaj(long dogadajId, LocalDate datumPocetka, String naziv,
                              int trajanje, long mjestoId);
}
