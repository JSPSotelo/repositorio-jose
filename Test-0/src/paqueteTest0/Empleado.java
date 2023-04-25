package paqueteTest0;

/**
* <h2>Clase EMPLEADO</h2>
* <p>Se usa para crear y leer empleados de una Base de Datos <br/>
* Buscar más información en <a href="http://www.eclipse.org">ECLIPSE</a></p>
* @version v.3-2022
* @author FPN
* @since 1-2021
*/
public class Empleado {

/**
* Atributo nombre del empleado
*/
private String nombre;

/**
* Atributo apellido del empleado
*/
private String apellido;

/**
* Atributo salario del empleado
*/
private double salario;

/**
* Constructor con 3 parámetros.
* Crea objetos empleado, con nombre, apellido y salario.
* @param nombre <i>Nombre del empleado</i>
* @param apellido <i>Apellido del empleado</i>
* @param salario <i>Salario del empleado</i>
*/
public Empleado(String nombre, String apellido, double salario) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.salario=salario;
}

//Métodos públicos

/**
* Aumenta el salario al empleado.
* @see Empleado
* @param aumento <i>Aumento a aplicar al salario</i>
*
*/
public void aumentosalario (double aumento) {
	salario = salario + aumento;
}

//Métodos privados

/**
* Comprueba que se escriba un nombre (no vacío).
* @return <ul>
* <li>true: el nombre No es una cadena vacía</li>
* <li>false: el nombre Sí es una cadena vacía</li>
* </ul>
*/
private boolean comprobar() {
	if(nombre.equals("")) {
		return false;
	}
	return true;
}
}
