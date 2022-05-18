package hr.fer.infusus.projekt.repository;

import hr.fer.infusus.projekt.domain.Mjesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MjestoRepository extends JpaRepository<Mjesto, Long> {
}