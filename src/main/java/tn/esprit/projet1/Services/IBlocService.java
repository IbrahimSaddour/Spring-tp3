package tn.esprit.projet1.Services;

import tn.esprit.projet1.entity.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc  bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long  idBloc);

    void removeBloc (long idBloc);

}
