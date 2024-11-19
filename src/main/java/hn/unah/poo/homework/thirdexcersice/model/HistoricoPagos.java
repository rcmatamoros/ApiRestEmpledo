package hn.unah.poo.homework.thirdexcersice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "historicopagos")
public class HistoricoPagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name="iddireccion")
    private int idDirecion;
    // @ForeignKey
    private String dni;
}
