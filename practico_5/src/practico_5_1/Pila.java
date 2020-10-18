package practico_5_1;

import java.util.Stack;

public class Pila {

	private Stack<Elemento> elementos;

	public Pila() {
		elementos = new Stack<Elemento>();
	}

	public void agregarElemento(Elemento el) {
		elementos.push(el);
	}

	// no necesita parámetro por que borra el último.
	public void eliminarElemento() {
		elementos.pop();
	}

	// saber si está vacía
	public boolean isEmpty() {
		return elementos.empty();
	}

	// el de top
	public String ultimoElemento() {
		String top = elementos.peek().getNombre();
		return top;
	}

	public int getCantidadElementos() {
		return elementos.size();
	}

	public void copiar(Pila pilaVacia) {
		int lenght = this.getCantidadElementos();
		for (int i = 0; i < lenght; i++) {
			pilaVacia.agregarElemento(elementos.get(i));
		}
	}
	
	
	// sugerido por ariel
	public Pila copiar() {
		Pila pilaVacia = new Pila();
		int lenght = this.getCantidadElementos();
		for (int i = 0; i < lenght; i++) {
			pilaVacia.agregarElemento(elementos.get(i));
		}
		return pilaVacia;
	}
	
	
	public void reverse(Pila pilaInvertida) {
		int lenght = this.getCantidadElementos();
		for (int i= lenght-1 ; i >= 0 ; i--) {
			pilaInvertida.agregarElemento(elementos.get(i));
		}
	}

	public String getElementoPosicion(int index) {
		String nombre = elementos.get(index).getNombre();
		return nombre;
	}
	

}
