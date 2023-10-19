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

public class Etudiant {
    @Id
    Long idEtudiant;
    String nomEt;
    String prenomEt;
    Long cin ;
    String ecole;
    @Temporal(TemporalType.DATE)
    Date dateNaissance;
    @ManyToMany
    Set<Reservation> reservations;






}
