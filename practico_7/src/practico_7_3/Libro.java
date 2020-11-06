package practico_7_3;

import java.util.Comparator;

public class Libro {

	private String nombre;
	private String autor;
	private int isbn;
	private int anoEdicion;
	private String genero;

	// intentar hacer como "caracteristica" , consultar a Ariel.

	public Libro(String nombre, String autor, int isbn, int anoEdicion, String genero) {
		this.nombre = nombre.toUpperCase();
		this.autor = autor.toUpperCase();
		this.isbn = isbn;
		this.anoEdicion = anoEdicion;
		this.genero = genero.toUpperCase();
	}

	/*
	 * getters
	 */

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public int getAnoEdicion() {
		return anoEdicion;
	}

	public String getGenero() {
		return genero;
	}

	/*
	 * metodos
	 */

	@Override
	public boolean equals(Object obj) {
		try {
			Libro libro = (Libro) obj;
			return ((libro.getNombre().equals(this.getNombre())) && (libro.getAutor().equals(this.getAutor())));
		} catch (Exception e) {
			return false;
		}
	}

	public String toString() {
		return this.isbn + ", " + this.nombre + ", " + this.autor + ", " + this.anoEdicion + ", " + this.genero + "\n";
	}

}
