package tn.esprit.projet1.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Universite {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idUniversite;
    String nomUniversite;
    String adresse;

    @OneToOne(mappedBy = "universite")
    private Foyer foyer;

}
