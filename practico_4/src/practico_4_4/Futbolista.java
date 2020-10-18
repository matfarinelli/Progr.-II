package practico_4_4;

public class Futbolista extends Persona {

	private String posicion;
	private String pieHabil;
	private int cantidadGoles;

	// constructor
	public Futbolista(String nombre, String apellido, int pasaporte, int dia, int mes, int anio, String estado,
			String posicion, String pieHabil, int cantidadGoles) {
		super(nombre, apellido, pasaporte, dia, mes, anio, estado);
		this.posicion = posicion;
		this.pieHabil = pieHabil;
		this.cantidadGoles = cantidadGoles;
	}

	// getter y setter

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getPieHabil() {
		return pieHabil;
	}

	public void setPieHabil(String pieHabil) {
		this.pieHabil = pieHabil;
	}

	public int getCantidadGoles() {
		return cantidadGoles;
	}

	public void setCantidadGoles(int cantidadGoles) {
		this.cantidadGoles = cantidadGoles;
	}

	@Override
	public String getDatos() {
		String datos = super.getDatos() + "\nPosicion: " + this.getPosicion() + "\nPie Habil: " + this.getPieHabil()
				+ "\nGoles: " + this.getCantidadGoles();
		return datos;
	}

	
	
}
