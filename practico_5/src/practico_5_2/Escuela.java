package practico_5_2;

import java.util.ArrayList;

public class Escuela {

	private String nombre;
	private ArrayList<Casa> casas;
	private Sombrero seleccionador;

	public Escuela() {
		this.setNombre("Howarts");
		casas = new ArrayList <Casa>();
	}

	public void agregarCasa(Casa casa) {
		casas.add(casa);
	}

	public ArrayList<Casa> getCasas() {
		return this.casas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
