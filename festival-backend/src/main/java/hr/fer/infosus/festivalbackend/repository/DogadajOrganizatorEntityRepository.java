package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.DogadajOrganizator;
import hr.fer.infosus.festivalbackend.domain.DogadajOrganizatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogadajOrganizatorEntityRepository extends JpaRepository<DogadajOrganizatorEntity, DogadajOrganizator> {
}
