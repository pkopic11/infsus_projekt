package hr.fer.infusus.projekt.repository;

import hr.fer.infusus.projekt.domain.Ulaznica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UlaznicaRepository extends JpaRepository<Ulaznica, Long> {
}
