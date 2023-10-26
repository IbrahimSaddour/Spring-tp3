package tn.esprit.projet1.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IBlocService;
import tn.esprit.projet1.entity.Bloc;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService iBlocService;

    @GetMapping("/bloc/affichiertout")
    List<Bloc> retrieveBlocs() {
        return iBlocService.retrieveBlocs();
    }

    @PutMapping("/bloc/modifier")
    Bloc updateBloc (@RequestBody Bloc  bloc){
        return iBlocService.updateBloc(bloc);
    }

    @PostMapping("/bloc/ajouter")
    Bloc addBloc (@RequestBody Bloc bloc){
        return iBlocService.addBloc(bloc);
    }

    @GetMapping("/bloc/afficherone/{id}")
    Bloc retrieveBloc (@PathVariable("id") long  idBloc){
        return iBlocService.retrieveBloc(idBloc);
    }

    @DeleteMapping("/bloc/supprimer/{id}")
    void removeBloc (@PathVariable("id") long idBloc){
        iBlocService.removeBloc(idBloc);
    }

}
