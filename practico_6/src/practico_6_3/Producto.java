package practico_6_3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Producto {

	private String nombre;
	protected LocalDate fechaAlquiler;
	protected LocalDate fechaVencimiento;
	protected boolean estaDisponible;
	private ArrayList<String> caracteristicas; // datos del auto y de las peliculas

	/*
	 * Metodos abstractos
	 */

	public abstract void alquilar(int dia, int mes, int anio, int dias_alquiler);

	public abstract void devolucion();

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

	public void setFechaAlquiler(int dia, int mes, int anio) {
		this.fechaAlquiler = LocalDate.of(anio, mes, dia);
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public boolean getDisponibilidad() {
		return this.estaDisponible;
	}

	// permite setear "manualmente la disponibilidad
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

	// no funciona (no se cual es mi error)
	public boolean estaAlquilerVencido() {
		if (this.fechaAlquiler.isAfter(this.fechaVencimiento) || (this.fechaAlquiler.isEqual(this.fechaVencimiento))) {
			// System.out.println(fechaAlquiler);
			// System.out.println(fechaVencimiento);
			return true;
		} else {
			// System.out.println(fechaAlquiler);
			// System.out.println(fechaVencimiento);
			return false;
		}
	}

	public boolean estaAlquilerVencido_() {
		LocalDate hoy = LocalDate.now();
		int diasRestantesAlquiler = Period.between(hoy, fechaVencimiento).getDays();

		if (diasRestantesAlquiler >= 0) {
			return false;
		} else
			return true;
	}

}
