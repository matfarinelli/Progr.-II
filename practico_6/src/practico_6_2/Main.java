package practico_6_2;

public class Main {

	public static void main(String[] args) {

		// por cuestiones practicas uso para todos los mismos sensores

		Sensor lluvia = new Sensor("Tandil");
		lluvia.addRegistro(250);
		lluvia.addRegistro(150);
		lluvia.addRegistro(100);
		lluvia.addRegistro(50);
		lluvia.addRegistro(120);
		lluvia.addRegistro(80);
		lluvia.addRegistro(120);
		lluvia.addRegistro(100);
		lluvia.addRegistro(33);
		lluvia.addRegistro(60);

		Sensor temperatura = new Sensor("Tandil");
		temperatura.addRegistro(20);
		temperatura.addRegistro(30);
		temperatura.addRegistro(31);
		temperatura.addRegistro(33);
		temperatura.addRegistro(33);
		temperatura.addRegistro(30);
		temperatura.addRegistro(32);
		temperatura.addRegistro(28);
		temperatura.addRegistro(35);
		temperatura.addRegistro(36);
		temperatura.addRegistro(33);
		temperatura.addRegistro(33);

		Sensor humedad = new Sensor("Tandil");
		Sensor viento = new Sensor("Tandil");

		EstacionMeteorologica emt = new EstacionMeteorologicaTandil("Tandil", temperatura, lluvia, humedad, viento, 5,
				110, 12, 25);
		System.out.println(temperatura.maximo(12));
		System.out.println(lluvia.promedio(8));
		System.out.println(emt.predecirLluvia());

		System.out.println("****************");

		EstacionMeteorologica emv = new EstacionMeteorologicaVela("Vela", temperatura, lluvia, humedad, viento, 54);

		humedad.addRegistro(25);
		System.out.println(emv.predecirLluvia());

		System.out.println("****************");

		EstacionMeteorologica emBB = new EstacionMeteorologicaBB("Bahia Blanca", temperatura, lluvia, humedad, viento,
				29, 35, 9, 53);

		humedad.addRegistro(25);
		humedad.addRegistro(55);
		humedad.addRegistro(75);
		humedad.addRegistro(79);
		humedad.addRegistro(100);
		humedad.addRegistro(100);
		humedad.addRegistro(35);
		humedad.addRegistro(20);
		humedad.addRegistro(0);
		humedad.addRegistro(5);
		
		System.out.println(humedad.promedio(9));
		
		viento.addRegistro(41);
		lluvia.addRegistro(20);
		
		System.out.println(emBB.predecirLluvia());

	}

}
