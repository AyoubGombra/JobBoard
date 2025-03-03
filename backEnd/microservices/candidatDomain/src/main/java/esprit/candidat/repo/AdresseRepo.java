package esprit.candidat.repo;

import esprit.candidat.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepo extends JpaRepository<Adresse, Integer> {
}
