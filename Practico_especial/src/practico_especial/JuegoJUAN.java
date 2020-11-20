package practico_especial;

import java.util.ArrayList;

import Pocimas.Pocima;

public class Juego {

	private String nombre;
	private Mazo mazo;
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador ganador;
	private Jugador perdedor;
	private int numeroMaximoRondas;
	private ArrayList<Pocima> pocimas;

	public Juego(String nombre, Jugador j1, Jugador j2, Mazo m1, int numeroMaximoRondas) {
		this.nombre = nombre;
		this.mazo = m1;
		this.jugador1 = j1;
		this.jugador2 = j2;
		this.numeroMaximoRondas = numeroMaximoRondas;
		this.pocimas = new ArrayList<>();
	}

	/*
	 * Metodos
	 */
	
	public Pocima eliminarPrimerPocima() {
		return this.pocimas.remove(0);
	}
	
	public void addPocima(Pocima pocima) {
		this.pocimas.add(pocima);
	}

	public void repartirCartas() {

		// System.out.println(this.mazo.getSize());
		int cantidadCartas = this.mazo.getSize();
		
		
		for (int i = 0; i < cantidadCartas; i++) {
			
			if(pocimas.size() > 0) {
				
				mazo.getPrimerCarta().recibirPocima(pocimas.get(0));
				this.eliminarPrimerPocima();
			}
		
			if (i % 2 == 0) {
					
					this.jugador1.addCarta(mazo.getPrimerCarta());
					
												
			} else {
					this.jugador2.addCarta(mazo.getPrimerCarta());
						
			}
			mazo.eliminarPrimerCarta();
		}
				
		
	}
	

	public void jugar() {
		
		
		// por defecto comienza el jugador1 considerándolo "ganador" de una ronda
		// anterior
		 ganador = jugador1;
		 perdedor = jugador2;
		 
		 
		int i = 1;

		// mientras los jugadores tengan cartas en su mazo y no se supere el numero max
		// de rondas
		while ((jugador1.getSizeMazo() > 0 && jugador2.getSizeMazo() > 0) && (i <= numeroMaximoRondas)) {

			// averiguar si va con "return toString" o un Syso está bien.
			System.out.println("-------------- RONDA Nº " + i + " --------------");

			this.jugarMano();

			// Control

			i++;
		}

		// para determinar ganador segun puntos

		this.getResultado(ganador, perdedor);

	}
	public String mensajeGanador(Jugador ganador , Jugador perdedor, double valorPocimadoJ1, double valorPocimadoJ2 ) {
		
		return "El ganador de la ronda fue  "+ ganador.getNombre() +" con "+ valorPocimadoJ1+ " y tiene "+ 
				 ganador.getSizeMazo() + " cartas en su mazo, mientras que " + perdedor.getNombre() +" con "+valorPocimadoJ2+ " tiene " + 
			+ perdedor.getSizeMazo();
		
		
	}
	public void jugarMano() {
		Carta c1 = ganador.jugarTurno();
		Carta c2 = perdedor.jugarTurno();

		Atributo atributoElegido = ganador.elegirAtributo(c1);
		Atributo atributoVs = perdedor.jugarDevolucion(atributoElegido);

		System.out.println("El jugador " + ganador.getNombre() + " selecciona competir por el atributo "
				+ atributoElegido.getNombre());
		System.out.println("La carta de " + ganador.getNombre() + " es " + c1.getNombre() + " con "
				+ atributoElegido.getNombre() + " " + atributoElegido.getValor());
		System.out.println("La carta de " + perdedor.getNombre() + " es " + c2.getNombre() + " con "
				+ atributoVs.getNombre() + " " + atributoVs.getValor());
		
		double valorPocimadoJ1 = c1.getEfectoPocima(atributoElegido);
		double valorPocimadoJ2 = c2.getEfectoPocima(atributoVs);
		if (valorPocimadoJ1 > (valorPocimadoJ2)) {

			perdedor.removeCartaPerdida();
			ganador.removeCartaPerdida();

			ganador.ganarCarta(c1, c2);
			

			ganador.sumarPunto();
			
			ganador = jugador1;
			perdedor = jugador2;
			
			System.out.println(this.mensajeGanador(ganador, perdedor, valorPocimadoJ1, valorPocimadoJ2));
		
		} else if  (valorPocimadoJ1 < valorPocimadoJ2) {
			ganador.removeCartaPerdida();
			perdedor.removeCartaPerdida();

			perdedor.ganarCarta(c1, c2);

			perdedor.sumarPunto();

			ganador = jugador2;
			perdedor = jugador1;
			
			System.out.println(this.mensajeGanador(ganador, perdedor , valorPocimadoJ1, valorPocimadoJ2));
			
		} else if  (valorPocimadoJ1 == valorPocimadoJ2) {

			ganador.enviarCartaAlFinal(c1);
			perdedor.enviarCartaAlFinal(c2);

			System.out.println("Empataron la ronda");
			System.out.println(this.mensajeGanador(ganador, perdedor, valorPocimadoJ1, valorPocimadoJ2));
			System.out.println("Quien comienza la ronda es: " + ganador.getNombre());
		}

	}

	public void cambiarMano(Jugador ganador, Jugador perdedor) {
		Jugador aux = new Jugador("aux");
		aux = perdedor;
		perdedor = ganador;
		ganador = aux;

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

}
