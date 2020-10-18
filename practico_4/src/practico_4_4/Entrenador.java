package practico_4_4;

public class Entrenador extends Persona {

	private String federacion;

	// constructor
	public Entrenador(String nombre, String apellido, int pasaporte, int dia, int mes, int anio, String estado,
			String federacion) {
		super(nombre, apellido, pasaporte, dia, mes, anio, estado);
		this.federacion = federacion;

	}

	// getter y setter
	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}

	public String getFederacion() {
		return federacion;
	}

	@Override
	public String getDatos() {
		String datos = super.getDatos() + "\nFederacion: " + this.getFederacion();
		return datos;
	}

}
