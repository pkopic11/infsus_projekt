package hr.fer.infosus.festivalbackend.repository;

import hr.fer.infosus.festivalbackend.domain.VanjskiKorisnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VanjskiKorisnikRepository extends JpaRepository<VanjskiKorisnik, Long> {
}
