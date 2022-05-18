package hr.fer.infusus.projekt.repository;

import hr.fer.infusus.projekt.domain.IzdavackaKuca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzdavackaKucaRepository extends JpaRepository<IzdavackaKuca, Long> {
}