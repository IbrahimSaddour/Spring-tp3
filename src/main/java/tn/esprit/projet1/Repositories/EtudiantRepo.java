package tn.esprit.projet1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet1.entity.Etudiant;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
}
