package practico_4_3;

public class EmpleadoComision extends Empleado {

	private double porcentaje;
	private double ventasRealizadas;
		
	public EmpleadoComision(double sueldoFijoSemanal, double porcentaje, double ventasRealizadas) {
		super(sueldoFijoSemanal);
		this.setPorcentaje(porcentaje);
		this.setVentasRealizadas(ventasRealizadas);
	}
	
	public EmpleadoComision(String nombre, double sueldoFijoSemanal, double porcentaje, double ventasRealizadas) {
		super(nombre, sueldoFijoSemanal);
		this.setPorcentaje(porcentaje);
		this.setVentasRealizadas(ventasRealizadas);
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getVentasRealizadas() {
		return ventasRealizadas;
	}

	public void setVentasRealizadas(double ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}
	
	public double calcularSueldo() {
		double sueldo;
		sueldo = super.calcularSueldo() + (this.getPorcentaje()*this.getVentasRealizadas());
		return sueldo;
	}
	
}
