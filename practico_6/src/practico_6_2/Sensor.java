package practico_6_2;

import java.util.ArrayList;

public class Sensor {

	private String nombre;
	private ArrayList<Double> registros;

	public Sensor(String nombre) {
		this.nombre = nombre;
		this.registros = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addRegistro(double registro) {
		registros.add(registro);
	}

	public ArrayList<Double> getRegistros() {
		return new ArrayList<>(this.registros);
	}

	private int registroDeInicio(int cantidadRegistros) {
		int inicioFor;
		int lenghtRegistros = this.registros.size();

		if (cantidadRegistros >= lenghtRegistros) {
			inicioFor = lenghtRegistros - cantidadRegistros;
		} else {
			inicioFor = 0;
		}

		return inicioFor;
	}

	// teniendo en cuenta los N ultimos registros

	public double promedio(int ultimosNregistros) {
		int inicioFor = registroDeInicio(ultimosNregistros);
		int lenghtRegistros = this.registros.size();
		double sumaRegistros = 0;
		int divisor = 0;

		for (int i = inicioFor; i < lenghtRegistros; i++) {
			double registro = this.registros.get(i);
			sumaRegistros += registro;
			divisor++;
		}

		if (divisor == 0) {
			return 0;
		}

		return sumaRegistros / divisor;
	}

	public double maximo(int ultimosNregistros) {
		int inicioFor = registroDeInicio(ultimosNregistros);
		int lenghtRegistros = this.registros.size();
		double maximo = Double.NEGATIVE_INFINITY; // el menor posible de "double"

		for (int i = inicioFor; i < lenghtRegistros; i++) {
			double registro = this.registros.get(i);
			if (registro > maximo) {
				maximo = registro;
			}
		}
		return maximo;
	}

	public double ultimo() {
		int lenght = registros.size();
		double ultimoRegistro = 0.0;
		if (lenght <= 0) {
			ultimoRegistro = 0.0;
		} else {
			ultimoRegistro = registros.get(lenght - 1);
		}
		return ultimoRegistro;
	}

}
