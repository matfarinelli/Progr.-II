package practico_4;

public class Main {

	public static void main(String[] args) {

		Alarma a1 = new Alarma();

		a1.setMovimiento(false);
		a1.setVidrioRoto(false);
		a1.setPuertaVentanaAbierta(true);

		System.out.println("Movimientos: " + a1.isMovimiento());
		System.out.println("Puertas/Ventanas: " + a1.isPuertaVentanaAbierta());
		System.out.println("Vidrios rotos: " + a1.isVidrioRoto());

		// Timbre t1 = new Timbre("Uooooooooooo Uoooooooo Uoooooooo");
		Timbre t1 = new Timbre();

		a1.comprobar(t1);

		System.out.println(" --------- ");

		AlarmaLuminosa al1 = new AlarmaLuminosa();
		Luz l1 = new Luz();

		al1.setMovimiento(false);
		al1.setVidrioRoto(false);
		al1.setPuertaVentanaAbierta(true);

		System.out.println("Movimientos: " + al1.isMovimiento());
		System.out.println("Puertas/Ventanas: " + al1.isPuertaVentanaAbierta());
		System.out.println("Vidrios rotos: " + al1.isVidrioRoto());

		Timbre t2 = new Timbre("UOOOOOOOOOOOOOOOOOOOOOOOOOOO!!!!!!");
		al1.comprobar(t2);
		
		
		System.out.println(" --------- ");

	}

}
