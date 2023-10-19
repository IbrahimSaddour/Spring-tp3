package tn.esprit.projet1.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Reservation {
    @Id
     Long idReservation;
    @Temporal(TemporalType.DATE)
     Date anneeUniversitaire;
    boolean estValide ;
    @ManyToMany(mappedBy = "reservations")  //mappedBy dima nhotouha lel moins faible(priorté loula dima lel cardinalité ken meme cardinalité ne5ou leli plus faible bel logique)
    Set<Etudiant> etudiants;




}
