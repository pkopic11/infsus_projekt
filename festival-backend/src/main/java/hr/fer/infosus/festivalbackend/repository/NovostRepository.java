package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.Novost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovostRepository extends JpaRepository<Novost, Long> {
}
