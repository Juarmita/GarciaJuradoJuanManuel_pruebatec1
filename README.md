
# Prueba Técnica 1
Este proyecto se basa en un CRUD básico de gestión de empleados por consola de una empresa.

## Funcionalidades
**Crear empleado**: Permite el alta en la base de datos de un nuevo empleado al sistema ingresando:
- Nombre
- Apellido
- Cargo
- Salario
- Fecha de inicio en el puesto


**Borrar empleado**: Elimina a un empleado existente proporcionando su identificador unido.

**Buscar empleado por cargo**: Busca empleados por su cargo. Hemos usado @querys para realizar esta búsqueda.

**Listar empleados**: Muestra un listado de todos los empleados registrados en el sistema.

**Editar empleado**: Permite modificar los datos de un empleado existente. Se ha implementado un menú para poder elegir el campo que se quiere editar.


## Running Tests

Se han realizado test de funcionamiento, que han sido los siguientes:

- Creacion de distintos empleados. Se han intentado ingresar distintas fechas de manera incorrecta para comprobar el funcionamiento.

- Borrado de los empleados: Se ha utilizado la id de los empleados para proceder al borrado de manera satisfactoria.

- Busqueda por cargo: Se han creado varios empleados con distintos cargos, y algunos con el mismo cargo. Los lista de forma correcta.

- Listar los empleados: Se ha usado List para el correcto listado de los elementos que hay en la base de datos.

- Editar empleados: Se han editado los distintos campos de cada objeto permitiendose el cambio correctamente.


## Supuestos
- Se ha supuesto que la persona que usa el programa conoce las id de los empleados, de la misma forma puede tener acceso a ellos si primero lista a todos ellos.

- Se asume que los datos van a ser facilitados por el usuario del programa.

- No hay limite a la cantidad de empleados, dando esto capacidad a una base de datos de empleados extensa.

- Dependencia de la entrada de datos: se confia en que el usuario ingrese datos validos ya que no hay una validación más allá que para la fecha.


## Ejecucion

- Clona el repositorio en el direcorio que desees.
- Abre una terminal y navega hasta el directorio raíz del proyecto.
- Compila el código fuente ejecutando el comando javac Main.java.
- Ejecuta la aplicación con el comando java Main.
## Uso

- Sigue las instrucciones mostradas en la consola para utilizar las diferentes funcionalidades del programa.
- Selecciona una opción del menú principal ingresando el número correspondiente y presionando Enter.
- Sigue las instrucciones adicionales que se muestran en pantalla para completar cada operación.
## Documentation

- [querys](https://www.arquitecturajava.com/jpa-query-language-objetos-vs-tablas/)
- [querys](https://www.arquitecturajava.com/jpa-query-language-objetos-vs-tablas/)
- [Validacion de la fecha](https://www.campusmvp.es/recursos/post/como-manejar-correctamente-fechas-en-java-el-paquete-java-time.aspx)
- [Validacion de la fecha](https://www.w3schools.com/java/java_date.asp)


## Authors

- Juan Manuel Garcia

