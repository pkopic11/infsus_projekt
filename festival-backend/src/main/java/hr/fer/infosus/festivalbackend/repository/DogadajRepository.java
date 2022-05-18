package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.Dogadaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogadajRepository extends JpaRepository<Dogadaj, Long> {
}
