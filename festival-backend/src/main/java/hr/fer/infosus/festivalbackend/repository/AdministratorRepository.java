package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
}
