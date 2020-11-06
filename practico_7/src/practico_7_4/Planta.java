package practico_7_4;

import java.util.ArrayList;

public class Planta {

	private String nombre;
	private ArrayList<String> nombresVulgares;
	private String clasificacionSuperior;
	private String familia;
	private String clase;
	private Boolean interior;
	private int riego;
	private int sol;

	/*
	 * Constructor
	 */

	public Planta(String nombre, String clasificacionSuperior, String familia, String clase, Boolean interior,
			int riego, int sol) {
		super();
		this.nombre = nombre.toUpperCase();
		this.nombresVulgares = new ArrayList<>();
		this.clasificacionSuperior = clasificacionSuperior.toUpperCase();
		this.familia = familia.toUpperCase();
		this.clase = clase.toUpperCase();
		this.interior = interior;
		this.riego = riego;
		this.sol = sol;
	}

	/*
	 * Getters
	 */

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getNombresVulgares() {
		return new ArrayList<>(this.nombresVulgares);
	}

	public String getClasificacionSuperior() {
		return clasificacionSuperior;
	}

	public String getFamilia() {
		return familia;
	}

	public String getClase() {
		return clase;
	}

	public Boolean getTipo() {
		return interior;
	}

	public int getRiego() {
		return riego;
	}

	public int getSol() {
		return sol;
	}

	public void addNombreVulgar(String nombreVulgar) {
		this.nombresVulgares.add(nombreVulgar);
	}

	/*
	 * Reimplementacion metodos
	 */

	public boolean equals(Object obj) {
		try {
			Planta planta = (Planta) obj;
			return (planta.getNombre().equals(this.getNombre()));
		} catch (Exception e) {
			return false;
		}
	}

	public String toString() {
		return this.nombre + ", " + this.familia + ", " + this.clase + ", " + this.clasificacionSuperior + ", "
				+ this.interior + ", " + this.riego + ", " + this.sol + "\n";
	}
}
