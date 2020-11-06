package practico_7_1;

import java.util.ArrayList;
import java.util.Collections;

public class Diccionario {

	ArrayList<Palabra> listaPalabras;

	public Diccionario() {
		listaPalabras = new ArrayList<>();
	}

	public void agregarPalabra(Palabra p) {
		if (!this.existePalabra(p)) {
			this.listaPalabras.add(p);
		} else {
			//////
		}
	}

	public boolean existePalabra(Palabra p) {

		for (Palabra element : listaPalabras) {
			String palabra = element.getNombre();
			return (p.getNombre().equals(palabra));
		}
		return false;

	}

	public void modificarPalabra(Palabra p, String nombre) {
		if (this.existePalabra(p)) {
			p.setNombre(nombre);
		}
	}

	public void eliminarPalabra(Palabra p) {

		if (this.existePalabra(p)) {
			this.listaPalabras.remove(p);
		}
	}

	public ArrayList<Palabra> getPalabras() {
		return new ArrayList<>(this.listaPalabras);
	}

	public ArrayList<Palabra> getPalabrasOrdenadas() {

		ArrayList<Palabra> ordenadas = new ArrayList<>(listaPalabras);

		/*
		 * otra forma ArrayList<Palabra> ordenadas = new ArrayList<>();
		 * ordenadas.addAll(listaPalabras);
		 */
		Collections.sort(ordenadas);

		return ordenadas;
	}

}