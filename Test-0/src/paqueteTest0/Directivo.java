package paqueteTest0;

/**
 * <h2>Clase Directivo</h2>
 * <p>Se pueden crear y leer datos de los directivos de la empresa.</p>
 * @author Nombre y Apellido del autor
 * @version v.1-2023
 * @since 26-04-2023
 */
public class Directivo {

/**
 * Atributo nombre del directivo	
 */
private String nombre;

/**
 * Atributo apellido del directivo
 */
private String apellido;

/**
 * Atributo sueldo del directivo
 */
private double sueldo;

/**
 * Es el Constructor con 3 parámetros.
 * Crea objetos directivo, con nombre, apellido y sueldo.
 * @param nombre <i>Nombre del directivo</i>
 * @param apellido <i>Apellido del directivo</i>
 * @param sueldo <i>Sueldo del directivo</i>
 */
public Directivo(String nombre, String apellido, double sueldo) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.sueldo=sueldo;
}

//Métodos públicos

/**
 * Aumenta el sueldo del directivo
 * @see Directivo
 * @param aumento <i>Aumento a aplicar al sueldo</i>
 */
public void aumentosueldo (double aumento) {
	sueldo = sueldo + aumento;
}

//Métodos privados

/**
 * Comprueba que se escriba el apellido.
 * @return <ul>
 * <li>true: el apellido NO es una cadena vacía</li>
 * <li>false: el apellido SÍ está vacío</li>
 * </ul>
 */
private boolean comprobar() {
	if(apellido.equals("")) {
	    return false;
	}
	return true; 
} 
}
