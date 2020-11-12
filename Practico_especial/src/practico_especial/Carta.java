package practico_especial;

import java.util.ArrayList;
import java.util.Random;

public class Carta implements Comparable<Carta> {

	private String nombre;
	private ArrayList<Atributo> atributos;

	public Carta(String nombre) {
		this.nombre = nombre;
		this.atributos = new ArrayList<>();
	}

	/*
	 * Getter y setter
	 */

	public String getNombre() {
		return nombre;
	}

	/*
	 * Metodos
	 */

	public void addAtributo(Atributo at) {
		// deberia ver si se repite o es valido
		this.atributos.add(at);
	}

	public boolean tieneAtributo(Atributo at) {
		for (int i = 0; i < atributos.size(); i++) {
			Atributo aux = this.atributos.get(i);
			if (aux.getNombre().equals(at.getNombre())) {
				return true;
			}
		}
		return false;
	}

	// BORRAR SI NO LO USAMOS
	public ArrayList<Atributo> getAtributos() {
		return new ArrayList<>(this.atributos);
	}

	public Atributo getAtributo(String aBuscado) {

		for (Atributo a : this.atributos) {
			if (a.getNombre().equals(aBuscado)) {
				return a;
			}
		}
		return null;
	}

	public Atributo getAtributoRandom() {

		Random r = new Random();
		Atributo a = this.atributos.get(r.nextInt(atributos.size()));

		return a;
	}

	/*
	 * Reimplementacion de metodos
	 */

	public boolean equals(Object obj) {
		try {
			Carta carta = (Carta) obj;
			return (carta.getNombre().equals(this.nombre));
		} catch (Exception e) {
			return false;
		}
	}

	public String toString() {
		return this.nombre + ": " + this.getAtributos() + "\n";
	}

	@Override
	public int compareTo(Carta carta) {
		return this.getNombre().compareTo(carta.getNombre());
	}
}
