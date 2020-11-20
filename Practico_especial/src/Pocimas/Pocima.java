package Pocimas;

import practico_especial.Atributo;

public abstract class Pocima {

	private String nombre;

	public Pocima(String nombre) {
		this.nombre = nombre;
	}

	public abstract double atributoConPocima(Atributo atributo);

	public String getNombre() {
		return nombre;
	}

	
	public String toString() {
		return "Nombre: " + this.getNombre();
	}
}
