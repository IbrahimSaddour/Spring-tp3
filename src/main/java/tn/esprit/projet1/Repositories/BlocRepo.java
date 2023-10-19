package tn.esprit.projet1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet1.entity.Bloc;

@Repository
public interface BlocRepo extends JpaRepository<Bloc, Long> {
}
