package practico_4_4;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellido;
	private int pasaporte;
	private LocalDate nacimiento;
	private String estado;
	private boolean disponible;

	// contructor
	public Persona(String nombre, String apellido, int pasaporte, int dia, int mes, int anio, String estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
		this.nacimiento = LocalDate.of(anio, mes, dia);
		this.estado = estado;
	}

	// getter y setter
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

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public int getPasaporte() {
		return pasaporte;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean isDisponible() {
		estado();
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getDatos() {
		return ("Nombre y apellido: " + this.nombre + " " + this.apellido + "\nPasaporte: " + this.pasaporte
				+ "\nFecha de Nacimiento: " + this.nacimiento + "\nEstado: " + this.estado + "\nDisponible: " + this.isDisponible());
	}

	public void estado() {
		String estado = this.estado;
		
		switch (estado) {
		case "Viajando":
			this.setDisponible(false);
			break;
		case "En concentracion":
			this.setDisponible(false);
			break;
		case "En pais de origen":
			this.setDisponible(true);
			break;
		default:
			this.setDisponible(false);
		}
	}

}
