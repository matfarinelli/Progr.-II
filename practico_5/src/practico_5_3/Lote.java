package practico_5_3;

import java.util.ArrayList;

public class Lote {

	private String numero;
	private ArrayList<String> minerales;
	private ArrayList<Cereal> cereales;
	private int hectareas;

	/*
	 * Constructor
	 */

	public Lote(String numero,int has) {
		this.numero = numero;
		minerales = new ArrayList<>();
		cereales = new ArrayList<>();
		hectareas = has;
	}

	/*
	 * Getter y Setter
	 */

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	/*
	// no es correcto retornar todos los minerales. Se rompe el encapsulamiento
	public ArrayList<String> getMinerales() {
		return minerales;
	}
	 */
	
	public int getHectareas() {
		return hectareas;
	}

	/*
	 * Method
	 */

	public void addMineral(String mineral) {
		minerales.add(mineral);
	}

	public void addCereal(Cereal cereal) {
		cereales.add(cereal);
	}

	// consultamos al lote si tiene el mineral
	public boolean tieneMineral(String mineral) {
		return this.minerales.contains(mineral);
	}

	public boolean cerealApto(Cereal cereal) {
		return (cereal.loteApto(this));
	}
}
