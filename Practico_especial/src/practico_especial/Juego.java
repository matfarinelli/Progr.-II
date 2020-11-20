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

		// System.out.println(this.mazo.getSize());
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

	public void jugar() {
		// anterior
		Jugador ganador = jugador1;
		Jugador perdedor = jugador2;
		int i = 1;

		// mientras los jugadores tengan cartas en su mazo y no se supere el numero max
		// de rondas
		while ((jugador1.getSizeMazo() > 0 && jugador2.getSizeMazo() > 0) && (i <= numeroMaximoRondas)) {

			// averiguar si va con "return toString" o un Syso está bien.
			System.out.println("-------------- RONDA Nº " + i + " --------------");

			this.jugarMano(ganador, perdedor);

			if (jugador1.isGanoUltima() == true) {
				ganador = jugador1;
				perdedor = jugador2;
				System.out.println("El ganador de la ronda fue " + jugador1.getNombre() + " y tiene "
						+ jugador1.getSizeMazo() + " cartas en su mazo, mientras que " + jugador2.getNombre()
						+ " tiene " + jugador2.getSizeMazo());

			} else if (jugador2.isGanoUltima() == true) {
				ganador = jugador2;
				perdedor = jugador1;
				System.out.println("El ganador de la ronda fue " + jugador2.getNombre() + " y tiene "
						+ jugador2.getSizeMazo() + " cartas en su mazo, mientras que " + jugador1.getNombre()
						+ " tiene " + jugador1.getSizeMazo());
			} else
				System.out.println("Empataron la ronda");

			// System.out.println("Quien comienza la ronda es: " + ganador.getNombre());
			// Control

			i++;
		}

		// para determinar ganador segun puntos

		this.getResultado(ganador, perdedor);

	}

	public void getResultado(Jugador jugador1, Jugador jugador2) {

		if (jugador1.getPuntos() > jugador2.getPuntos()) {
			System.out.println("Gano " + jugador1.getNombre());

		} else if (jugador1.getPuntos() == jugador2.getPuntos()) {
			System.out.println("Empate ");

		} else {
			System.out.println("Gano " + jugador2.getNombre());
		}

		System.out.println(jugador1.getNombre() + " con " + jugador1.getPuntos());
		System.out.println(jugador2.getNombre() + " con " + jugador2.getPuntos());

	}

	public void jugarMano(Jugador mano, Jugador noMano) {
		Carta c1 = mano.jugarTurno();
		Carta c2 = noMano.jugarTurno();

		Atributo atributoElegido = mano.elegirAtributo(c1);
		Atributo atributoVs = noMano.jugarDevolucion(atributoElegido);

		System.out.println("El jugador " + mano.getNombre() + " selecciona competir por el atributo "
				+ atributoElegido.getNombre());
		System.out.println("La carta de " + mano.getNombre() + " es " + c1.getNombre() + " con "
				+ atributoElegido.getNombre() + " " + atributoElegido.getValor());
		System.out.println("La carta de " + noMano.getNombre() + " es " + c2.getNombre() + " con "
				+ atributoVs.getNombre() + " " + atributoVs.getValor());

		if (atributoElegido.getValor() > (atributoVs.getValor())) {

			noMano.removeCartaPerdida();
			mano.removeCartaPerdida();

			mano.ganarCarta(c1, c2);

			mano.setGanoUltima(true);
			noMano.setGanoUltima(false);

			mano.sumarPunto();

		} else if (atributoElegido.getValor() < (atributoVs.getValor())) {
			mano.removeCartaPerdida();
			noMano.removeCartaPerdida();

			noMano.ganarCarta(c1, c2);

			mano.setGanoUltima(false);
			noMano.setGanoUltima(true);

			noMano.sumarPunto();

		} else if (atributoElegido.getValor() == (atributoVs.getValor())) {

			mano.enviarCartaAlFinal(c1);
			noMano.enviarCartaAlFinal(c2);

			System.out.println("Empataron la ronda");
		}

	}

}
