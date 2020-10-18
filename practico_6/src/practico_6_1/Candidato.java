package practico_6_1;

import java.util.ArrayList;

public class Candidato {

	private String nombre;
	private String empresa;
	private double sueldo;
	private boolean exclusivo;

	private Criterio criterio;

	// private ArrayList<Criterio> criterios; // define la aceptación de contratos
	// del candidato

	// consulta: en los constructores es necesario usar todos los atributos de la
	// clase?

	/*
	 * CONSTRUCTOR
	 */
	public Candidato(String nombre, String empresa, double sueldo/*, boolean exclusivo , Criterio criterio */) {
		this.nombre = nombre;
		this.empresa = empresa;
		this.sueldo = sueldo;
		//this.exclusivo = false; // en principio no son exclusivos
		// this.criterio = criterio;
		// criterios = new ArrayList<>();
	}

	/*
	 * GETTER Y SETTER
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public boolean isExclusivo() {
		return exclusivo;
	}

	public void setExclusivo(boolean exclusivo) {
		this.exclusivo = exclusivo;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

	public Criterio getCriterio() {
		return criterio;
	}

	// consultar si no rompe encapsulamiento.

	/*
	 * public ArrayList<Criterio> getCriterios() { return new
	 * ArrayList<>(this.criterios); }
	 */
	/*
	 * public void addCriterio(Criterio criterio) { criterios.add(criterio); }
	 */

	public String toString() {
		return "Nombre: " + this.getNombre() + "\nEmpresa: " + this.getEmpresa() + "\nSueldo: " + this.getSueldo()
				+ "\nExclusividad: " + this.isExclusivo() + "\nCriterios: " + this.getCriterio() + "\n";
	}

	// quiero retornar getCriteriosc omo String, pero me tira posiciones de memoria.
	// Donde deberia redefinir el toString?, en criterio?

	public boolean evaluarContrato(Contrato contrato) {
		return this.criterio.evaluarContrato(contrato);
	}
}
