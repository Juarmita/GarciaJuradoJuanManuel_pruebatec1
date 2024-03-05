package com.mycompany.empleados;

import com.mycompany.empleados.logic.Controladora;
import com.mycompany.empleados.logic.Empleado;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Recogemos los datos por consola

        int opc = -1; //Opcion elegida por el usuario
        //Instancia de la controladora
        Controladora control = new Controladora();

        while (opc != 0) {
            //Uso la excepcion para evitar que el programa se cierre si hay un error
            try {
                System.out.println("-------------Menú seleccion------------\n"
                        + "\nElige una opción:\n"
                        + "\n1- Crear empleado: \n"
                        + "\n2- Borrar empleado: \n"
                        + "\n3- Buscar empleado por cargo: \n"
                        + "\n4- Listar empleados: \n"
                        + "\n5- Editar Empleado: \n"
                        + "\n0- Terminar");

                //Recogemos la variable por consola
                opc = Integer.parseInt(scanner.nextLine());

                switch (opc) {
                    case 0:
                        System.out.println("Proceso terminado");
                        break;

                    case 1:

                        //Agregamos los datos
                        System.out.println("Agregar un nuevo empleado");
                        System.out.println("-------------------------");
                        Empleado trabajador = new Empleado();
                        System.out.println("Introduzca el nombre del empleado: ");
                        trabajador.setNombre(scanner.nextLine());
                        System.out.println("Introduzca el apellido del empleado: ");
                        trabajador.setApellido(scanner.nextLine());
                        System.out.println("Introduzca cargo del empleado: ");
                        trabajador.setCargo(scanner.nextLine());
                        System.out.println("Introduzca el salario: ");
                        double salario = Double.parseDouble(scanner.nextLine());
                        trabajador.setSalario(salario);
                        System.out.println("Introduzca la fecha de inicio en formato dd/mm/yyyy: ");
                        trabajador.setFechaInicio(scanner.nextLine());

                        //Creacion empleado
                        control.crearTrabajador(trabajador);
                        System.out.println("Empleado dado de alta!!");
                        break;

                    case 2:
                        //ToDo: una vez terminado el basico volver para implementar borrado logico
                        //Borrado de datos
                        //Damos por supuesto que el usuario conoce el id del empleado a borrar
                        System.out.println("Borrado de empleado");
                        System.out.println("-------------------");
                        System.out.println("Introduzca el id del empleado a eliminar:");
                        int idEliminar = Integer.parseInt(scanner.nextLine());
                        control.borrarTrabajador(idEliminar);
                        System.out.println("Usuario Eliminado!!");

                        break;

                    case 3:
                        // Solicitar al usuario que ingrese el cargo a buscar
                        System.out.println("Introduce el cargo a buscar:");
                        String cargoABuscar = scanner.nextLine();
                        // Llamar al método buscarPorCargo y proporcionar el cargo que el usuario ha ingresado
                        List<Empleado> empleadosEncontrados = control.buscarPorCargo(cargoABuscar);//Listamos los empleados

                        try {
                            if (empleadosEncontrados.isEmpty()) {//Si no encontramos ningun empleado con el cargo devolvemos el mensaje
                                throw new Exception("No se encontraron empleados con el cargo especificado.");
                            } else {
                                System.out.println("Empleados con el cargo " + cargoABuscar + ":");//Si lo encontramos los devolvemos
                                for (Empleado empleado : empleadosEncontrados) {
                                    System.out.println(empleado);
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }

                        break;

                    case 4:

                        List<Empleado> listaEmpleados = control.traerTrabajador();
                        System.out.println("Aqui tiene el listado de los empleados: ");
                        System.out.println("-------------------------------------");
                        for (Empleado elemento : listaEmpleados) {
                            System.out.println(elemento.toString());
                        }

                        break;

                    case 5:
                        System.out.println("Edición del empleado");
                        System.out.println("--------------------");

                        System.out.println("---Selecciona el campo---\n"
                                + "\nElige una opción:\n"
                                + "\n1- Editar Nombre: \n"
                                + "\n2- Editar Apellido: \n"
                                + "\n3- Editar Cargo: \n"
                                + "\n4- Editar Salario: \n"
                                + "\n5- Editar Fecha:\n"
                                + "\n0- Terminar");

                        int opc2 = Integer.parseInt(scanner.nextLine());

                        switch (opc2) {
                            case 0:
                                System.out.println("Edicion terminada.");
                                break;
                            case 1:
                                System.out.println("Introduzca el id del empleado a editar: ");
                                int idEditar = scanner.nextInt();
                                Empleado emplEdit = control.buscarEmpleado(idEditar);
                                System.out.println("Introduzca el nuevo nombre");
                                emplEdit.setNombre(scanner.nextLine());
                                control.editarEmpleado(emplEdit);

                                break;
                            case 2:
                                System.out.println("Introduzca el id del empleado a editar: ");
                                idEditar = scanner.nextInt();
                                emplEdit = control.buscarEmpleado(idEditar);
                                System.out.println("Introduzca el nuevo Apellido: ");
                                emplEdit.setApellido(scanner.next());
                                control.editarEmpleado(emplEdit);
                                break;

                            case 3:
                                System.out.println("Introduzca el id del empleado a editar: ");
                                idEditar = scanner.nextInt();
                                emplEdit = control.buscarEmpleado(idEditar);
                                System.out.println("Introduzca el nuevo Cargo: ");
                                emplEdit.setCargo(scanner.next());
                                control.editarEmpleado(emplEdit);
                                break;

                            case 4:
                                System.out.println("Introduzca el id del empleado a editar: ");
                                idEditar = (scanner.nextInt());
                                emplEdit = control.buscarEmpleado(idEditar);
                                System.out.println("Introduzca el nuevo sueldo: ");
                                emplEdit.setSalario(scanner.nextDouble());
                                control.editarEmpleado(emplEdit);
                                break;
                            case 5:
                                System.out.println("Introduzca el id del empleado a editar: ");
                                idEditar = scanner.nextInt();
                                emplEdit = control.buscarEmpleado(idEditar);
                                System.out.println("Introduzca la nueva fecha de comienzo en formato dd/mm/aaaa: ");
                                emplEdit.setFechaInicio(scanner.next());
                                control.editarEmpleado(emplEdit);
                                break;

                            default:
                                System.out.println("Opcion no reconocida");

                        }
                        break;

                    default:
                        System.out.println("Opcion no reconocida");
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Intentelo de nuevo");
            }
        }

    }

}

