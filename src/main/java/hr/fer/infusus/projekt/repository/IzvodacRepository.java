package hr.fer.infusus.projekt.repository;

import hr.fer.infusus.projekt.domain.Izvodac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzvodacRepository extends JpaRepository<Izvodac, Long> {
}