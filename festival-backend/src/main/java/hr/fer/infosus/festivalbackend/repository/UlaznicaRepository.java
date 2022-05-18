package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.Ulaznica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UlaznicaRepository extends JpaRepository<Ulaznica, Long> {
}
