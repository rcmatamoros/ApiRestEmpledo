package hn.unah.poo.homework.thirdexcersice.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmpleadoDTO {

    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;
}
