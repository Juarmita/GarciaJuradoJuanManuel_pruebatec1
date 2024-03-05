package com.mycompany.empleados.persistance;

import com.mycompany.empleados.logic.Empleado;
import com.mycompany.empleados.persistance.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ControladoraPersistencia {

    EmpleadoJpaController empleJpa = new EmpleadoJpaController();

    public void crearTrabajador(Empleado trabajador) {
        empleJpa.create(trabajador);
    }

    public List<Empleado> traerTrabajador() {
        return empleJpa.findEmpleadoEntities();
    }

    public void borrarTrabajador(int idEliminar) {
        try {
            empleJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Empleado buscarEmpleado(int idEditar) {
        return empleJpa.findEmpleado(idEditar);
    }

    public void editarEmpleado(Empleado emplEdit) {
        try {
            empleJpa.edit(emplEdit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Empleado> buscarPorCargo(String cargo) {
        EntityManager em = getEntityManager(); // Obtener el EntityManager
        Query query = em.createQuery("SELECT e FROM Empleado e WHERE e.cargo = :cargo");//uso de querys para poder acceder al cargo
        query.setParameter("cargo", cargo);
        List<Empleado> empleados = query.getResultList();//Obtencion de los empleados con el cargo que deseamos
        return empleados;//Devolvemos la lista de empleados con el cargo buscado
    }

    private EntityManager getEntityManager() {
        return empleJpa.getEntityManager();
    }

}
