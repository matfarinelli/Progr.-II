package practico_3_4;

import java.util.ArrayList;

public class Serie {

	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	ArrayList<Temporada> lista_temporadas;

	public Serie(String titulo, String descripcion, String creador, String genero) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		lista_temporadas = new ArrayList<Temporada>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int get_episodios_vistos() {
		int contador_capitulos_serie = 0;
		int episodios_vistos_temp = 0;

		for (int index = 0; index < lista_temporadas.size(); index++) {
			episodios_vistos_temp = lista_temporadas.get(index).get_episodios_vistos();
			contador_capitulos_serie += episodios_vistos_temp;
		}
		return contador_capitulos_serie;
	}

	public void agregarTemporada(Temporada temp) { // por parametro le paso un objeto Temporada
		lista_temporadas.add(temp);
	}

	public boolean completada() {
		int lenght_lista = lista_temporadas.size();

		for (int i = 0; i < lenght_lista; i++) {

			if (lista_temporadas.get(i).completada() == false) {
				return false;
			}
		}
		return true;
	}

	public double get_promedio() {
		double suma_calificaciones = 0;
		int contador_temporadas_vistas = 0;
		int lenght_temporadas = lista_temporadas.size();

		for (int index = 0; index < lenght_temporadas; index++) {

			if (lista_temporadas.get(index).completada() == true) {
				suma_calificaciones += lista_temporadas.get(index).promedio_calificacion();
				//System.out.println("promedio temporada  " + (index+1) + " / " + lista_temporadas.get(index).promedio_calificacion());
				contador_temporadas_vistas++;
			}
		}
		
		return suma_calificaciones / contador_temporadas_vistas;
	}

}
