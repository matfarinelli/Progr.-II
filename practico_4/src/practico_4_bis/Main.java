package practico_4_bis;

public class Main {

	public static void main(String[] args) {

		Timbre t1 = new Timbre();
		Alarma a1 = new Alarma(t1);

		System.out.println("Movimientos: " + a1.isMovimiento());
		System.out.println("Puertas/Ventanas: " + a1.isPuertaVentanaAbierta());
		System.out.println("Vidrios rotos: " + a1.isVidrioRoto());
		System.out.println("Sonido: " + t1.isEstado());
		System.out.println("------------------------");

		a1.setMovimiento(true);
		a1.comprobar();
		a1.disparar(t1);

		System.out.println("Movimientos: " + a1.isMovimiento());
		System.out.println("Puertas/Ventanas: " + a1.isPuertaVentanaAbierta());
		System.out.println("Vidrios rotos: " + a1.isVidrioRoto());
		System.out.println("Sonido: " + t1.isEstado());
		System.out.println("------------------------");

		//System.out.println(a1.comprobar()); // deberia hacer sonar...

		System.out.println("------------------------");

		Luz l1 = new Luz();
		Timbre t2 = new Timbre();
		AlarmaLuminosa al1 = new AlarmaLuminosa(t2, l1);
		System.out.println("Alarma luminosa:");
		System.out.println("Movimientos: " + al1.isMovimiento());
		System.out.println("Puertas/Ventanas: " + al1.isPuertaVentanaAbierta());
		System.out.println("Vidrios rotos: " + al1.isVidrioRoto());
		System.out.println("Sonido: " + t2.isEstado());
		System.out.println("Luces encendidas: " + l1.isEstado());
		System.out.println("------------------------");

		al1.setPuertaVentanaAbierta(false);
		al1.comprobar();
		al1.disparar(t2);
		System.out.println("Alarma luminosa:");
		System.out.println("Movimientos: " + al1.isMovimiento());
		System.out.println("Puertas/Ventanas: " + al1.isPuertaVentanaAbierta());
		System.out.println("Vidrios rotos: " + al1.isVidrioRoto());
		System.out.println("Sonido: " + t2.isEstado());
		System.out.println("Luces encendidas: " + l1.isEstado());
		System.out.println("------------------------");

		//System.out.println(al1.comprobar()); // deberia hacer sonar

	}

}
