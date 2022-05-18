package hr.fer.infusus.projekt.repository;

import hr.fer.infusus.projekt.domain.Dogadaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogadajRepository extends JpaRepository<Dogadaj, Long> {
}