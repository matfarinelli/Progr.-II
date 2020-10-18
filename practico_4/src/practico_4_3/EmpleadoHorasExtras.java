package practico_4_3;

public class EmpleadoHorasExtras extends Empleado {

	private double horasExtras;
	private double valorHora;

	public EmpleadoHorasExtras(double sueldoFijoSemanal, double horasExtras, double valorHora) {
		super(sueldoFijoSemanal);
		this.horasExtras = horasExtras;
		this.valorHora = valorHora;
	}
	
	public EmpleadoHorasExtras(String nombre, double sueldoFijoSemanal, double horasExtras, double valorHora) {
		super(nombre , sueldoFijoSemanal);
		this.horasExtras = horasExtras;
		this.valorHora = valorHora;
	}
	

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public double calcularSueldo() {
		double sueldo;
		sueldo = super.calcularSueldo() + (this.getHorasExtras() * this.getValorHora());
		return sueldo;
	}
}
