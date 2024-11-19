package hn.unah.poo.homework.thirdexcersice.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
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
@Table(name = "")
public class Empleado {
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;

}
