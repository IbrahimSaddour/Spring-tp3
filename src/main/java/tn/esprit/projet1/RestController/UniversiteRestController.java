package tn.esprit.projet1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IUniversiteService;
import tn.esprit.projet1.entity.Universite;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService iUniversiteService;

    @GetMapping("/universite/affichertout")
    List<Universite> retrieveAllUniversities(){
        return iUniversiteService.retrieveAllUniversities();
    }

    @PostMapping("/universite/ajouter")
    Universite addUniversity (@RequestBody Universite u){
        return iUniversiteService.addUniversity(u);
    }

    @PutMapping("/universite/modifier")
    Universite updateUniversity (Universite u){
        return iUniversiteService.updateUniversity(u);
    }

    @GetMapping("/universite/afficherone/{id}")
    Universite retrieveUniversity (@PathVariable("id") long idUniversity){
        return iUniversiteService.retrieveUniversity(idUniversity);
    }
}
