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

public class Foyer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idFoyer;
    String nomFoyer;
    Long capaciteFoyer;

    @OneToOne
    private Universite universite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> blocs;

}
