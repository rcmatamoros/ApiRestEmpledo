package hn.unah.poo.homework.thirdexcersice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.poo.homework.thirdexcersice.model.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, String> {

}
