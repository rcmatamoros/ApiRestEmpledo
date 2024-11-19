package hn.unah.poo.homework.thirdexcersice.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.homework.thirdexcersice.model.Empleado;
import hn.unah.poo.homework.thirdexcersice.model.HistoricoPagos;
import hn.unah.poo.homework.thirdexcersice.repository.EmpleadoRepositorio;

@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio eRepositorio;
    private ModelMapper modelMapper;

    public String crearEmpleado() {
        return "";
    }

    public String deleteEmpleado(){
    return " ";

    public Optional<Empleado> searchEmpleado(String dni) {
        modelMapper = new ModelMapper();
        return eRepositorio.findById(dni);
    }

    public List<Empleado> obtenerEmpleados() {
        return eRepositorio.findAll();
    }

}

/*
 * Con base en lo anterior usted deberá crear: Modelos, Repositorios, servicios
 * y
 * controladores que permitan realizar estas tareas:
 * a. Método para crear empleados
 * Parámetros: Json con las propiedades del empleado
 * b. Método para eliminar empleados
 * Parámetros: id de empleado a eliminar
 * c. Método para buscar Empleado (deberá devolver el historial de pagos)
 * Parámetros: id de empleado a buscar
 * d. Método para obtener todos los empleados (deberá incluir el historial de
 * pagos de
 * todos los empleados)
 * Parámetros: Ninguno
 * e. Método para obtener los pagos de un empleado en una fecha específica
 * Parámetros: Json Request
 * {“idEmpleado: “idEmpleado”,
 * “fechaInicio”: “fechaInicio”,
 * “fechaFin”: “fechaFin”}
 * f. Método para crear pago de empleado:
 * Parámetros: Json request
 * {
 * “idEmpleado” : “idEmpleado”,
 * “horasTrabajadas” : “999”,
 * “precioPorHora” : “999.99”
 * }
 * Usted deberá validar que el empleado exista, de igual forma que tanto horas
 * trabajadas como precio por hora sean mayor que 0.
 * El método deberá calcular el total (horasTrabajadas * precioPorHora) y la
 * fecha
 * deberá tomarla del sistema.
 */