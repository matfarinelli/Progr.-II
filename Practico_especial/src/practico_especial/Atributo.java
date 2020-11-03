package practico_especial;

public class Atributo {

	private String nombre;
	private int valor;

	public Atributo(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public Atributo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getValor() {
		return valor;
	}

	/*
	 * Reimplementacion metodos
	 */

	public boolean equals(Object obj) {
		try {
			Atributo at = (Atributo) obj;
			return (at.getNombre().equals(this.nombre));
		} catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return this.nombre + ": " + this.valor;
	}

}
