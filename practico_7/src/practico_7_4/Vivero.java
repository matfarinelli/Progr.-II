package practico_7_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vivero {

	private String nombre;
	private ArrayList<Planta> plantas;

	/*
	 * Constructor
	 */

	public Vivero(String nombre) {
		this.nombre = nombre.toUpperCase();
		this.plantas = new ArrayList<>();
	}

	/*
	 * Métodos
	 */

	public void addPlanta(Planta plantaNueva) {
		// controlo por nombre cientifico si está repetida
		for (Planta planta : this.plantas) {
			if (plantaNueva.getNombre().equals(planta.getNombre())) {
				return;
			}
		}
		this.plantas.add(plantaNueva);
	}

	// métodos de búsqueda

	public ArrayList<Planta> getPlantas(Criterio criterio) {
		ArrayList<Planta> plantasAux = new ArrayList<Planta>();

		for (int i = 0; i < this.plantas.size(); i++) {
			Planta planta = this.plantas.get(i);
			if (criterio.cumple(planta)) {
				System.out.println("DENTRO!: " + planta.getNombre());
				plantasAux.add(planta);
			}
		}
		return plantasAux;
	}

	public ArrayList<Planta> getPlantasOrdenadas(Criterio criterio, Comparator<Planta> ordenador) {
		ArrayList<Planta> plantasAux = new ArrayList<>();

		for (int i = 0; i < this.plantas.size(); i++) {
			Planta planta = this.plantas.get(i);
			if (criterio.cumple(planta)) {
				plantasAux.add(planta);
			}
		}

		Collections.sort(plantasAux, ordenador);
		return plantasAux;
	}

	public ArrayList<Planta> getPlantas() {
		ArrayList<Planta> plantas = new ArrayList<>(this.plantas);
		return plantas;
	}
}
