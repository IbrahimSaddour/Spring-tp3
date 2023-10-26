package tn.esprit.projet1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IEtudiantService;
import tn.esprit.projet1.entity.Etudiant;

import java.util.List;


@RestController
@AllArgsConstructor
public class EtudiantRestController {
    IEtudiantService iEtudiantService;


    @GetMapping("/etudiant/affichertout")
    List<Etudiant> retrieveAllEtudiants(){
        return iEtudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/etudiant/ajouter")
    List<Etudiant> addEtudiants (@RequestBody List<Etudiant> etudiants){
        return iEtudiantService.addEtudiants(etudiants);
    }

    @PutMapping("/etudiant/modifier")
    Etudiant updateEtudiant (@RequestBody Etudiant e){
        return iEtudiantService.updateEtudiant(e);
    }

    @GetMapping("/etudiant/afficherone/{id}")
    Etudiant retrieveEtudiant(@PathVariable("id") long  idEtudiant){
        return iEtudiantService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/etudiant/supprimer/{id}")
    void removeEtudiant(@PathVariable("id") long idEtudiant){
        iEtudiantService.removeEtudiant(idEtudiant);
    }
}
