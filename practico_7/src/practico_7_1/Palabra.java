package practico_7_1;

import java.util.ArrayList;
import java.util.Collections;

public class Palabra implements Comparable<Palabra> {

	private String nombre;
	private String funcion;
	ArrayList<String> sinonimos;
	ArrayList<String> antonimos;
	ArrayList<String> definicion;

	public Palabra(String nombre, String funcion) {
		this.nombre = nombre;
		this.funcion = funcion;
		sinonimos = new ArrayList<>();
		antonimos = new ArrayList<>();
		definicion = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getFuncion() {
		return funcion;
	}

	public void agregarSinonimo(String sinonimo) {
		this.sinonimos.add(sinonimo);
	}

	public void agregarAntonimo(String antonimo) {
		this.antonimos.add(antonimo);
	}

	public void agregarDefinicion(String def) {
		this.definicion.add(def);
	}

	 public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//////////////////////////////

	public ArrayList<String> getSinonimosOrdenados() {

		ArrayList<String> ordenadas = new ArrayList<>(sinonimos);

		/*
		 * otra forma ArrayList<String> ordenadas = new ArrayList<>();
		 * ordenadas.addAll(sinonimos);
		 */
		Collections.sort(ordenadas);

		return ordenadas;
	}

	public ArrayList<String> getSinonimos() {
		return new ArrayList<>(this.sinonimos);
	}

	/////////////////////

	@Override
	public boolean equals(Object obj) {
		try {
			Palabra otra = (Palabra) obj;
			return this.getNombre().equals(otra.getNombre());
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public String toString() {

		return this.getNombre(); // ","+ this.getSinonimos();
	}

	@Override
	public int compareTo(Palabra o) {

		return this.getNombre().compareTo(o.getNombre());
	}

}
