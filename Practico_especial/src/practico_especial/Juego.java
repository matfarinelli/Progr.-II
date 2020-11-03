package practico_especial;

import java.util.ArrayList;

public class Juego {

	private String nombre;
	private Mazo mazo;
	private Jugador jugador1;
	private Jugador jugador2;
	private int numeroMaximoRondas;

	public Juego(String nombre, String j1, String j2, int numeroMaximoRondas) {
		this.nombre = nombre;
		this.mazo = new Mazo();
		this.jugador1 = new Jugador(j1);
		this.jugador2 = new Jugador(j2);
		this.numeroMaximoRondas = numeroMaximoRondas;
	}

	/*
	 * Metodos
	 */
	
	public void repartirCartas(Jugador j1 , Jugador j2, Mazo mazo) {
		
	}
	
}
