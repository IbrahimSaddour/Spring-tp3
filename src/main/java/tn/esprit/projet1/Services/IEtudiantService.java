package tn.esprit.projet1.Services;

import tn.esprit.projet1.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    List<Etudiant> addEtudiants (List<Etudiant> etudiants);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(long  idEtudiant);

    void removeEtudiant(long idEtudiant);
}
