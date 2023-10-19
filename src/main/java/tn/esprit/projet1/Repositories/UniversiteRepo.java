package tn.esprit.projet1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet1.entity.Universite;

@Repository
public interface UniversiteRepo extends JpaRepository<Universite,Long> {
}
