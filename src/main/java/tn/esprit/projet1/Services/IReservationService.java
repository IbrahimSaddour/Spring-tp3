package tn.esprit.projet1.Services;

import tn.esprit.projet1.entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();


    Reservation updateReservation (Reservation  res);

    Reservation retrieveReservation (long idReservation);
}
