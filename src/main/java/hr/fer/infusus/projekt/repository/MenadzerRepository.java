package hr.fer.infusus.projekt.repository;

import hr.fer.infusus.projekt.domain.Administrator;
import hr.fer.infusus.projekt.domain.Menadzer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenadzerRepository extends JpaRepository<Menadzer, Long> {
}