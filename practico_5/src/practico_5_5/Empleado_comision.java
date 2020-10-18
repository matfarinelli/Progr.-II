package practico_5_5;

public class Empleado_comision extends Empleado {

	private double comision;
	private double ventas;

	public Empleado_comision(String nombre, String apellido, int dni, double sueldo, double ventas, double comision) {
		super(nombre, apellido, dni, sueldo);
		this.comision = comision;
		this.ventas = ventas;
	}

	@Override
	public double getSueldo() {
		return this.comision * this.ventas + super.getSueldo();
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

}
