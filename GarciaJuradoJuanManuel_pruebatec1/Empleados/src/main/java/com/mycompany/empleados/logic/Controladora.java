package com.mycompany.empleados.logic;

import com.mycompany.empleados.persistance.ControladoraPersistencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class Controladora {

    @PersistenceContext
    private EntityManager em;

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearTrabajador(Empleado trabajador) {
        controlPersis.crearTrabajador(trabajador);
    }

    public List<Empleado> traerTrabajador() {
        return controlPersis.traerTrabajador();
    }

    public void borrarTrabajador(int idEliminar) {
        controlPersis.borrarTrabajador(idEliminar);
    }

    public Empleado buscarEmpleado(int idEditar) {
        return controlPersis.buscarEmpleado(idEditar);
    }

    public void editarEmpleado(Empleado emplEdit) {
        controlPersis.editarEmpleado(emplEdit);
    }

    public List<Empleado> buscarPorCargo(String cargo) {
        return controlPersis.buscarPorCargo(cargo);
    }

}
