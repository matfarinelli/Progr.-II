package practico_5_5;

public class EmpleadoBono extends Empleado {

	private double bono;
	private int cantidadVentas;
	private Empresa empresa;

	public EmpleadoBono(String nombre, String apellido, int dni, double sueldo, int cantidadVentas, double bono,
			Empresa empresa) {
		super(nombre, apellido, dni, sueldo);
		this.setCantidadVentas(cantidadVentas);
		this.setBono(bono);
		this.empresa = empresa;
	}

	// lo deberia hacer la empresa?
	public void setBono(double bono) {
		this.bono = bono;
	}

	public double getBono() {
		return this.bono;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public boolean correspondeBono() {
		return (this.getCantidadVentas() >= empresa.getVentasRequeridas());
	}

	/*
	 * public double getSueldoBono() { return super.getSueldo() + this.getBono(); }
	 */

	@Override
	public double getSueldo() {
		double sueldo = super.getSueldo();
		if (this.correspondeBono()) {
			sueldo += this.getBono();
			// return this.getSueldoBono();
		}
		return sueldo;
	}

}
