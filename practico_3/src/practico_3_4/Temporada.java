package practico_3_4;

import java.util.ArrayList;

public class Temporada {

	private String nombre;
	ArrayList<Episodio> lista_episodios; // un arreglo que va a guardar Episodios (como objeto) y se llama
											// lista_episodios

	public Temporada(String nombre) {
		//lista_episodios = new ArrayList<>(); //también la toma
		lista_episodios = new ArrayList<Episodio>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarEpisodio(Episodio ep) { // por parametro le paso un objeto Episodio
		lista_episodios.add(ep);
	}

	public int get_episodios_vistos() {
		int contador_episodios_vistos = 0;
		int lenght_lista = lista_episodios.size(); // metodo size() para contar - lenght

		for (int index = 0; index < lenght_lista; index++) {
			if (lista_episodios.get(index).isFlag()) { // .get(index) metodo para devolver la iteración
				contador_episodios_vistos++;
			}
		}

		return contador_episodios_vistos;
	}

	public double promedio_calificacion() {

		double suma_calificaciones = 0;
		int lenght_lista = lista_episodios.size();
		int contador_episodios_vistos = 0;

		for (int i = 0; i < lenght_lista; i++) {
			int calificacion_ep = lista_episodios.get(i).getCalificacion(); // que cada episodio al iterar me de su
																			// calificacion
			if (calificacion_ep > 0) {
				suma_calificaciones += calificacion_ep;
				contador_episodios_vistos++;
			}
		}
		return suma_calificaciones / contador_episodios_vistos;
	}

	public boolean completada() {
		int lenght_lista = lista_episodios.size();
		for (int i = 0; i < lenght_lista; i++) {
			if (lista_episodios.get(i).isFlag() == false) {
				return false;
			}
		}
		return true;
	}

}
