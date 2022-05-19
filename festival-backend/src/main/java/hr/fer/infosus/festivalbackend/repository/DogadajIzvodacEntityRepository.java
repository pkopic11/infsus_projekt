package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.DogadajIzvodac;
import hr.fer.infosus.festivalbackend.domain.DogadajIzvodacEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogadajIzvodacEntityRepository extends JpaRepository<DogadajIzvodacEntity, DogadajIzvodac> {
}
