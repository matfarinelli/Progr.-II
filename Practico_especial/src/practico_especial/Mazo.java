package practico_especial;

import java.util.ArrayList;
import java.util.Collections;

import Pocimas.Pocima;

public class Mazo {

	private ArrayList<Carta> cartas;
	private ArrayList<Atributo> atributos; // atributos propios del mazo
	private ArrayList<Pocima> pocimas;

	public Mazo() {
		this.cartas = new ArrayList<>();
		this.atributos = new ArrayList<>(); // atributos del juego
		this.pocimas = new ArrayList<>();
	}

	/*
	 * Metodos
	 */

	public void addCartasAptas(Carta carta) {
		// deberiamos controlar que no este repetida y corresponda al mazo
		// carta tendria que tener un metodo para contar y conocer sus atributos (5)
		if (chequearAtributos(carta)) {
			addCarta(carta);
		}
	}

	// para los mazos de jugadores
	public void addCarta(Carta carta) {
		this.cartas.add(carta);
	}

	public void addCartaGanada(Carta carta) {
		this.cartas.add(0, carta);
	}

	public Carta getPrimerCarta() {
		return this.cartas.get(0);
	}

	public Carta getCartaAJugar() {
		return this.cartas.get(this.getSize() - 1);
	}

	public Carta eliminarPrimerCarta() {
		return this.cartas.remove(0);
	}

	public Carta eliminarCartaJugada() {
		return this.cartas.remove(this.cartas.size() - 1);
	}

	public boolean chequearAtributos(Carta carta) {
		for (int i = 0; i < this.atributos.size(); i++) {
			Atributo aux = this.atributos.get(i);
			if (!carta.tieneAtributo(aux)) {
				return false;
			}
		}
		return true;
	}

	public void addAtributo(Atributo at) {
		this.atributos.add(at);
	}
	
	
	public void addPocima(Pocima pocima) {
		this.pocimas.add(pocima);
	}

	// borrar si no se usa
	public ArrayList<Carta> getCartas() {
		return new ArrayList<>(this.cartas);
	}

	/*
	 * public boolean cartaRepetida(Carta carta) { for (int i = 0; i <
	 * cartas.size(); i++) { Carta aux = cartas.get(i); return
	 * (aux.getNombre().equals(carta.getNombre())); } return false; }
	 */

	public void mezclar() {
		Collections.shuffle(cartas);
	}

	public int getSize() {
		return this.cartas.size();
	}

}
