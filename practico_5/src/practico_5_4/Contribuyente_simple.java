package practico_5_4;

public class Contribuyente_simple {

	private String nombre;
	private int cuit;
	protected double montoFijo;

	public Contribuyente_simple(String nombre, int cuit, double montoFijo) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.montoFijo = montoFijo;
	}

	public double getImpuesto() {
		return montoFijo;
	}

	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

}
