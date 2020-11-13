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
	
	public void comienzaJuego() {
		Jugador ganador = jugador1;
		Jugador perdedor = jugador2;
				
		for(int i=1; i <= numeroMaximoRondas; i++ ) {
			if(jugador1.isGanoUltima() == true ) {
				 ganador = jugador1;
				 perdedor = jugador2;
				 jugador1.sumarPunto();
			}
			else {
				 ganador = jugador2;
				 perdedor = jugador1;
				 jugador2.sumarPunto();
			}
			this.jugarMano(ganador, perdedor);
				
			}
		if(jugador1.getPuntos()>jugador2.getPuntos()) {
			
			System.out.println("gano "+ jugador1.getNombre());
		}
		else if(jugador1.getPuntos( ) == jugador2.getPuntos()){
			System.out.println("empate ");
		}
		else {
			System.out.println("gano "+ jugador2.getNombre());
		}
		System.out.println(jugador1.getNombre()+" con "+ jugador1.getPuntos());
		System.out.println(jugador2.getNombre()+" con "+ jugador2.getPuntos() );
	}

	public void jugarMano(Jugador ganador , Jugador perdedor) {
		Carta c1 = ganador.jugarTurno();
		Carta c2 = perdedor.jugarTurno();

		Atributo atributoElegido = c1.getAtributoRandom();
		Atributo atributoVs = c2.getAtributo(atributoElegido.getNombre());

	//	System.out.println(atributoElegido.getNombre() + ", " + atributoElegido.getValor());
	//	System.out.println(atributoVs.getNombre() + ", " + atributoVs.getValor());
		
		if (atributoElegido.getValor()>(atributoVs.getValor())) {
			
			jugador1.removeCartaPerdida();
			jugador2.removeCartaPerdida();
			jugador1.addCartaGanada(c1);
			jugador1.addCartaGanada(c2);
			
		//	System.out.println("ganador "+jugador1.getNombre() );
			jugador1.setGanoUltima(true);
			jugador2.setGanoUltima(false);
			
			
		} else if (atributoElegido.getValor()<(atributoVs.getValor())) {
			jugador1.removeCartaPerdida();
			jugador2.removeCartaPerdida();
			jugador2.addCartaGanada(c1);
			jugador2.addCartaGanada(c2);
		//	System.out.println("ganador "+jugador2.getNombre());
			jugador1.setGanoUltima(false);
			jugador2.setGanoUltima(true);
			
		} else 
			
			jugador1.removeCartaPerdida();
			jugador2.removeCartaPerdida();
			jugador1.addCartaGanada(c1);
			jugador2.addCartaGanada(c2);
			
		
	}

}
