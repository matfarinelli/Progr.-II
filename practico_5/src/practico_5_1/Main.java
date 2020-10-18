package practico_5_1;

public class Main {

	public static void main(String[] args) {

		Elemento e1 = new Elemento("Primero");
		Elemento e2 = new Elemento("Segundo");
		Elemento e3 = new Elemento("Tercero");
		Elemento e4 = new Elemento("Cuarto");
		Elemento e5 = new Elemento("Cinco");
		Pila p1 = new Pila();

		System.out.println("Pila Vacía : " + p1.isEmpty());

		p1.agregarElemento(e1);
		p1.agregarElemento(e2);
		p1.agregarElemento(e3);
		p1.agregarElemento(e4);
		p1.agregarElemento(e5);

		System.out.println(p1);
		System.out.println("************");

		// System.out.println(p1.ultimoElemento());
		// System.out.println(p1.getCantidadElementos());

		// p1.eliminarElemento();
		// System.out.println(p1.ultimoElemento());
		// System.out.println(p1.getCantidadElementos());

		System.out.println(p1.ultimoElemento());
		System.out.println(p1.getCantidadElementos());

		System.out.println("Pila Vacía : " + p1.isEmpty());

		Pila pilaCopiada = new Pila();
		System.out.println("Lista 2 vacía? " + pilaCopiada.isEmpty());

		p1.copiar(pilaCopiada);

		System.out.println("Lista 2 vacía? " + pilaCopiada.isEmpty());
		// pilaCopiada.agregarElemento(e3);
		System.out.println(
				"Ultimo elemento\nPila 1: " + p1.ultimoElemento() + " * " + "Pila 2: " + pilaCopiada.ultimoElemento());

		pilaCopiada.reverse(pilaCopiada);
		
		System.out.println(
				"Ultimo elemento\nPila 1: " + p1.ultimoElemento() + " * " + "Pila 2: " + pilaCopiada.ultimoElemento());

		System.out.println("Controlar inversión!");
		
		pilaCopiada.eliminarElemento();
		pilaCopiada.eliminarElemento();

		System.out.println(
				"Ultimo elemento\nPila 1: " + p1.ultimoElemento() + " * " + "Pila 2: " + pilaCopiada.ultimoElemento());

		Pila p3 = new Pila();
		
		p1.copiar(p3);
		
		for (int i = 0; i < p3.getCantidadElementos(); i++) {

			System.out.println("Posición: " + i + " " + p3.getElementoPosicion(i));
		}
		
		System.out.println("Invertir:");
		
		p1.reverse(p3);
		
		System.out.println("Ultimo elemento\nPila 3: " + p3.ultimoElemento());

		for (int i = 0; i < p3.getCantidadElementos(); i++) {

			System.out.println("Posición: " + i + " " + p3.getElementoPosicion(i));
		}
	}

}
