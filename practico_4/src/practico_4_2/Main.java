package practico_4_2;

public class Main {

	public static void main(String[] args) {

		Timbre t1 = new Timbre();
		AlarmaSensorial as1 = new AlarmaSensorial(t1);
		Sensor s1 = new Sensor("Entrada");

		as1.agregarSensor(s1);

		// control principal - todo en orden

		as1.chequearSensores();

		System.out.println("******************SEPARADOR******************");

		// hasta acá, joya!

		Sensor s2 = new Sensor("Cocina");
		as1.agregarSensor(s2);

		as1.chequearSensores();

		System.out.println("******************SEPARADOR******************");

		// ----- ok!

		Sensor s3 = new Sensor("Garage");
		as1.agregarSensor(s3);
		// determino 2 zonas conflictivas
		s3.setEstado(true);
		s1.setEstado(true);
		as1.chequearSensores();
		System.out.println(as1.zonasActivadas());

		System.out.println("******************SEPARADOR******************");

		// reseteo
		as1.resetear();
		as1.chequearSensores();

		System.out.println("******************SEPARADOR******************");

		// prueba de alarma luminica

		Luz l1 = new Luz();

		AlarmaLuminica al1 = new AlarmaLuminica(t1, l1);

		al1.agregarSensor(s1);
		al1.agregarSensor(s2);
		al1.agregarSensor(s3);

		al1.chequearSensores();

		
		System.out.println("******************SEPARADOR******************");
		
		// para hacerla sonar , conflicto en sensor 3
		s3.setEstado(true); 
		al1.chequearSensores();
		System.out.println("Luz: " +  l1.isEstado()); //

		
		System.out.println("******************SEPARADOR******************");
		
		// reset 
		System.out.println("Probando RESETEO alarma luminica");
		al1.resetear();
		al1.chequearSensores();
		System.out.println("Luz: " +  l1.isEstado()); 

	}

}
