package practico_6_3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Producto {

	private String nombre;
	protected LocalDate fechaAlquiler;
	protected LocalDate fechaVencimiento;
	protected boolean estaDisponible;
	private ArrayList<String> caracteristicas;

	/*
	 * no consideré que sean importantes para el enunciado las particularidades de
	 * la pelicula o auto
	 */

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

	// consultar -> supuse que los productos podían alquilarse por "x" cantidad de
	// días.

	public void alquilar(int dia, int mes, int anio, int dias_alquiler) {
		this.fechaAlquiler = LocalDate.of(anio, mes, dia);
		this.fechaVencimiento = this.fechaAlquiler.plusDays(dias_alquiler);
		this.setDisponibilidad(false);
	}

	// no funciona
	public boolean estaAlquilerVencido() {
		if (this.fechaAlquiler.isAfter(this.fechaVencimiento)){
			System.out.println(fechaAlquiler);
			System.out.println(fechaVencimiento);
			return true;
		} else {
			System.out.println(fechaAlquiler);
			System.out.println(fechaVencimiento);
			return false;
		}
	}

}
