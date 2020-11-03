package practico_especial;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

	private ArrayList<Carta> cartas;
	private ArrayList<Atributo> atributos; // atributos propios del mazo

	public Mazo() {
		this.cartas = new ArrayList<>();
		this.atributos = new ArrayList<>();
	}

	/*
	 * Metodos
	 */

	public void addCartas(Carta carta) {
		// deberiamos controlar que no este repetida y corresponda al mazo
		// carta tendria que tener un metodo para contar y conocer sus atributos (5)
		if (chequearAtributos(carta)){ 
			this.cartas.add(carta);
		}
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

	public ArrayList<Carta> getCartas() {
		return new ArrayList<>(this.cartas);
	}

	/*
	public boolean cartaRepetida(Carta carta) {
		for (int i = 0; i < cartas.size(); i++) {
			Carta aux = cartas.get(i);
			return (aux.getNombre().equals(carta.getNombre()));
		}
		return false;
	}*/

	public void mezclar() {
		Collections.shuffle(cartas);
	}
	
}