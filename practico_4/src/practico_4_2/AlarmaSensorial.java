package practico_4_2;

import java.util.ArrayList;

public class AlarmaSensorial {

	protected Timbre timbre; // tiene que ser protected para poder acceder desde la alarmaLuminica
	private ArrayList<Sensor> sensores;
	ArrayList<String> zonasActivadas; // creo un arrayList con las zonas con sector activado

	public AlarmaSensorial(Timbre t1) {
		this.timbre = new Timbre();
		sensores = new ArrayList<Sensor>(); // significa que va a tener una lista de sensores
	}

	public void agregarSensor(Sensor s1) {
		sensores.add(s1);
	}

	public void resetear() {
		int lenghtSensores = sensores.size();
		for (int i = 0; i < lenghtSensores; i++) {
			timbre.apagar();
			sensores.get(i).setEstado(false);
		}
	}

	public void chequearSensores() {
		int lenghtSensores = sensores.size();
		int sensoresActivos = 0;

		for (int i = 0; i < lenghtSensores; i++) {
			if (sensores.get(i).chequear() == true) {
				timbre.hacerSonar();
				sensoresActivos++;
			}

		}

		if (sensoresActivos == 0) {
			System.out.println("Todo en orden");
		}

	}

	public ArrayList<String> zonasActivadas() {
		int lenghtSensores = sensores.size();
		zonasActivadas = new ArrayList<String>();

		for (int i = 0; i < lenghtSensores; i++) {
			if (sensores.get(i).chequear() == true) {
				zonasActivadas.add(sensores.get(i).getZona());
			}
		}
		return zonasActivadas;
	}

}
