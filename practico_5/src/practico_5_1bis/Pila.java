package practico_5_1bis;

import java.util.ArrayList;

public class Pila {

	private ArrayList<String> elementos;

	public Pila() {
		elementos = new ArrayList<>();
	}

	public void push(String el) {
		elementos.add(el);
	}

	public String top() {
		int lenght = elementos.size();
		return elementos.get(lenght - 1);
	}

	public int size() {
		int lenght = elementos.size();
		return lenght;
	}

	public String pop() {
		int lenght = elementos.size();

		if (lenght != 0) {
			return elementos.remove(lenght - 1);
		}

		return null;
	}

	public String toString() {
		return elementos.toString();
	}

	public Pila reverse() {
		Pila pilaInvertida = new Pila();
		int lenght = this.elementos.size();
		for (int i = lenght - 1; i >= 0; i--) {
			pilaInvertida.push(elementos.get(i));
		}
		return pilaInvertida;
	}

	public Pila copy() {
		Pila copia = new Pila();
		int lenght = this.elementos.size();
		for (int i = 0; i < lenght; i++) {
			copia.push(elementos.get(i));
		}
		return copia;
		
	}
}
