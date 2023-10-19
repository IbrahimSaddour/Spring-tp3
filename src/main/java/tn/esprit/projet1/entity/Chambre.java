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
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChambre;
    Long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;
    @ManyToOne
    Bloc bloc;
    @OneToMany
    Set<Reservation> reservations;




}
