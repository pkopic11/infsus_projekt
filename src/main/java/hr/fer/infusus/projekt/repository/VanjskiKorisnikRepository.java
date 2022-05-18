package hr.fer.infusus.projekt.repository;

import hr.fer.infusus.projekt.domain.VanjskiKorisnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VanjskiKorisnikRepository extends JpaRepository<VanjskiKorisnik, Long> {
}