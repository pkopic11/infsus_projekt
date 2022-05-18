package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.Izvodac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzvodacRepository extends JpaRepository<Izvodac, Long> {
}
