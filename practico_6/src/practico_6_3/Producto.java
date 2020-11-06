package practico_6_3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Producto {

	private String nombre;
	protected boolean estaDisponible;
	private ArrayList<String> caracteristicas; // datos del auto y de las peliculas

	/*
	 * Metodos abstractos
	 */

	public abstract void meAlquilaron();

	public abstract void meDevolvieron();

	/*
	 * Constructor
	 */

	public Producto(String nombre) {
		this.nombre = nombre;
		this.estaDisponible = true; // por defecto está disponible
	}

	/*
	 * Add , Set y get
	 */

	public String getNombre() {
		return this.nombre;
	}

	public boolean getDisponibilidad() {
		return this.estaDisponible;
	}

	// permite setear "manualmente la disponibilidad y es invocado por los
	// abstractos
	public void setDisponibilidad(boolean disponibilidad) {
		this.estaDisponible = disponibilidad;
	}

	public void addCaracteristica(String caracteristica) {
		caracteristicas.add(caracteristica);
	}

	public ArrayList<String> getCaracteristicas() {
		return new ArrayList<>(this.caracteristicas);
	}

	/*
	 * Métodos
	 */

	public String toString() {
		return this.getNombre();
	}

}
