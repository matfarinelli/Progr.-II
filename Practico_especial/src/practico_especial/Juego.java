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

		System.out.println(this.mazo.getSize());
		int cantidadCartas = this.mazo.getSize();

		for (int i = 0; i < cantidadCartas; i++) {

			if (i % 2 == 0) {
				this.jugador1.addCarta(mazo.getPrimerCarta());
			} else {
				this.jugador2.addCarta(mazo.getPrimerCarta());
			}
			mazo.eliminarPrimerCarta();
		}
	}

	public void jugarMano() {
		Carta c1 = jugador1.jugarTurno();
		Carta c2 = jugador2.jugarTurno();

		Atributo atributoElegido = c1.getAtributoRandom();
		Atributo atributoVs = c2.getAtributo(atributoElegido.getNombre());

		System.out.println(atributoElegido.getNombre() + ", " + atributoElegido.getValor());
		System.out.println(atributoVs.getNombre() + ", " + atributoVs.getValor());
		
		if (atributoElegido.getValor()>(atributoVs.getValor())) {
			System.out.println("ganador 1" );
		} else if (atributoElegido.getValor()<(atributoVs.getValor())) {
			System.out.println("ganador 2" );
		} else 
			System.out.println("Empate");
		
	}

}
