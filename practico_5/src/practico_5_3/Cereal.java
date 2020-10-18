package practico_5_3;

import java.util.ArrayList;

public class Cereal {

	private String nombre;
	private String tipo; // creo que al pedo, no se usa.
	private ArrayList<String> minerales;

	/*
	 * Constructor
	 */

	public Cereal(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		minerales = new ArrayList<>();
	}

	/*
	 * Getter y Setter
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	// mal. Rompe encapsulamiento
	public ArrayList<String> getMinerales() {
		return minerales;
	}

	/*
	 * Method
	 */

	public void addMineral(String mineral) {
		minerales.add(mineral);
	}

	public boolean tieneMineral(Lote lote) {
		int lenght = this.minerales.size(); // cuenta el tamaño del arreglo con los minerales que necesita el cereal
		for (int i = 0; i < lenght; i++) {
			String mineral = this.minerales.get(i); // guardo en una variable "mineral" para comparar en la iteración
			if (!lote.tieneMineral(mineral)) {
				return false;
			}
		}
		return true;
	}

	public boolean loteApto(Lote lote) {
		for (int i = 0; i < this.minerales.size(); i++) {
			String mineral = minerales.get(i);
			if (!lote.tieneMineral(mineral)) {
				return false;
			}
		}
		return true;
	}

}
