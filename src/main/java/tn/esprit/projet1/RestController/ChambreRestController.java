package tn.esprit.projet1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IChambreService;
import tn.esprit.projet1.entity.Chambre;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {
    IChambreService iChambreService;

    @GetMapping("/affichertout")
    List<Chambre> retrieveAllChambres(){
        return iChambreService.retrieveAllChambres();
    }

    @PostMapping("/ajouterchambre")
    Chambre addChambre(@RequestBody Chambre c){
        return iChambreService.addChambre(c);
    }

    @PutMapping("/modifierchambre")
    Chambre updateChambre (@RequestBody Chambre c){
        return iChambreService.updateChambre(c);
    }

    @GetMapping("/afficherone/{id}")
    Chambre retrieveChambre (@PathVariable("id") long idChambre){
        return iChambreService.retrieveChambre(idChambre);
    }
}
