package practico_6_7;

import java.util.ArrayList;

public class Documento {

	private String titulo;
//	private ArrayList<Autor> autores;
	private ArrayList<String> autores;
	private String contenido;
	private ArrayList<String> palabrasClave;

	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.autores = new ArrayList<>();
		this.palabrasClave = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public ArrayList<String> getTags() {
		return new ArrayList<>(this.palabrasClave);
	}

	public ArrayList<String> getAutores() {
		return new ArrayList<>(this.autores);
	}

	public void addAutor(String autor) {
		this.autores.add(autor.toUpperCase());
	}

	public void addTag(String tag) {
		this.palabrasClave.add(tag.toUpperCase());
	}

	// reimplementacion de métodos

	public String toString() {
		return "Titulo: " + this.getTitulo() + ", " + this.getContenido();
	}

	@Override
	public boolean equals(Object o) {
		try {
			Documento doc = (Documento) o;
			return this.getTitulo().equals(doc.getTitulo());
		} catch (Exception e) {
			return false;
		}
	}

	// ****** "content equals" -> busca contenido textual en String?

	public boolean tieneTag(String tagBuscado) {
		for (int i = 0; i < palabrasClave.size(); i++) {
			String tag = palabrasClave.get(i);
			// if (tag.equals(tagBuscado)) {
			// if (tag.contains(tagBuscado)) {
			if (tag.contentEquals(tagBuscado)) {
				return true;
			}
		}
		return false;
	}

	public boolean tieneAutor(String autorBuscado) {
		for (int i = 0; i < autores.size(); i++) {
			String tag = autores.get(i);
			if (tag.contains(autorBuscado)) {
				// if (tag.equals(autorBuscado)) { //busca "literal"
				// if (tag.contentEquals(autorBuscado)) { ////busca "literal"
				return true;
			}
		}
		return false;
	}
}
