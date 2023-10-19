package tn.esprit.projet1.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Bloc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idBloc;
    String nomBloc;
    Long capaciteBloc;
    @ManyToOne
    Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres;


}
