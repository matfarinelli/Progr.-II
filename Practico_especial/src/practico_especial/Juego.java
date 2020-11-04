package practico_especial;

import java.util.ArrayList;

public class Juego {

	private String nombre;
	private Mazo mazo;
	private Jugador jugador1;
	private Jugador jugador2;
	private int numeroMaximoRondas;

	public Juego(String nombre, Jugador j1, Jugador j2, Mazo m1, int numeroMaximoRondas) {
		this.nombre = nombre;
		this.mazo = m1;
		this.jugador1 = j1;
		this.jugador2 = j2;
		this.numeroMaximoRondas = numeroMaximoRondas;
	}

	/*
	 * Metodos
	 */

	public void repartirCartas() {
		System.out.println(mazo.getSize());
		for (int i = 0; i < mazo.getSize()-1; i++) {
			Carta aux = mazo.getPrimerCarta();
			if (i % 2 == 0) {
				this.jugador1.addCarta(aux);
			} else {
				this.jugador2.addCarta(aux);
			}
			mazo.getCartas().remove(i);
		}
	}

}
