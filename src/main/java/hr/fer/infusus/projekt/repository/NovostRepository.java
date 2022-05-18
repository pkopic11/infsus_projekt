package hr.fer.infusus.projekt.repository;

import hr.fer.infusus.projekt.domain.Novost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovostRepository extends JpaRepository<Novost, Long> {
}