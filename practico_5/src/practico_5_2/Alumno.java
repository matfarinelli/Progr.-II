package practico_5_2;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String apellido;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiares;

	/*
	 * // CONSTRUCTORES
	 */

	public Alumno(String nombre) {
		this.nombre = nombre;
		cualidades = new ArrayList<>();
		familiares = new ArrayList<>();
	}

	/*
	 * // GETTER Y SETTER
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/*
	public ArrayList<String> getCualidades() {
		return cualidades;
	}*/

	public void addCualidad(String cualidad) {
		this.cualidades.add(cualidad);
	}

	// esto está mal, rompe encapsulamiento
	/*
	public ArrayList<Alumno> getFamiliares() {
		return familiares;
	}
	*/
	
	
	public void addFamiliar(Alumno alumno) {
		this.familiares.add(alumno);
	}

	/*
	 * // METODOS
	 */

}
