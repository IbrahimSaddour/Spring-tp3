package tn.esprit.projet1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1.Services.IReservationService;
import tn.esprit.projet1.entity.Reservation;

import java.util.List;


@RestController
@AllArgsConstructor
public class ReservationRestController {
    IReservationService iReservationService;

    @GetMapping("/reservation/affichertout")
    List<Reservation> retrieveAllReservation(){
        return iReservationService.retrieveAllReservation();
    }

    @PutMapping("/reservation/modifier")
    Reservation updateReservation (@RequestBody Reservation  res){
        return iReservationService.updateReservation(res);
    }

    @GetMapping("/reservation/afficherone/{id}")
    Reservation retrieveReservation (@PathVariable("id") long idReservation){
        return iReservationService.retrieveReservation(idReservation);
    }
}
