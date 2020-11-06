package practico_6_4;

public class Main {

	public static void main(String[] args) {

		Computadora compu1 = new Computadora("Intel i3", 100);
		Computadora compu2 = new Computadora("AMD", 125);
		Computadora compu3 = new Computadora("Intel i5", 150);
		Computadora compu4 = new Computadora("Intel Celeron", 50);
		Computadora compu5 = new Computadora("Intel i7", 250);

		Proceso proceso1 = new Proceso("exe1", 12);
		Proceso proceso2 = new Proceso("exe2", 10);
		Proceso proceso3 = new Proceso("exe3", 19);
		Proceso proceso4 = new Proceso("exe4", 2);
		Proceso proceso5 = new Proceso("exe5", 25);
		Proceso proceso6 = new Proceso("exe6", 16);

		ColaOrdenada colaCompus = new ColaOrdenada();
		colaCompus.agregar(compu4);
		colaCompus.agregar(compu3);
		colaCompus.agregar(compu2);
		colaCompus.agregar(compu1);
		colaCompus.agregar(compu5);

		ColaOrdenada colaProcesos = new ColaOrdenada();
		colaProcesos.agregar(proceso6);
		colaProcesos.agregar(proceso5);
		colaProcesos.agregar(proceso4);
		colaProcesos.agregar(proceso3);
		colaProcesos.agregar(proceso1);
		colaProcesos.agregar(proceso2);

		while (colaProcesos.tamanio() > 0) {
			Proceso procesoPrioritario = (Proceso) colaProcesos.siguiente();
			System.out.println(procesoPrioritario);
		}

		System.out.println("**********");
		
		while (colaCompus.tamanio() > 0) {
			Computadora compuPrioritaria = (Computadora) colaCompus.siguiente();
			System.out.println(compuPrioritaria);
		}

	}

}
