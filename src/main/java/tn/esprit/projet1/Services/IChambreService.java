package tn.esprit.projet1.Services;

import tn.esprit.projet1.entity.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre  c);

    Chambre retrieveChambre (long idChambre);
}
