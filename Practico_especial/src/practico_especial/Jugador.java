package practico_especial;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private ArrayList<Carta> cartas; 

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

} 
