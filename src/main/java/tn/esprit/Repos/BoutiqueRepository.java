package tn.esprit.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Entity.Boutique;

public interface BoutiqueRepository extends JpaRepository<Boutique, Long> {
}
