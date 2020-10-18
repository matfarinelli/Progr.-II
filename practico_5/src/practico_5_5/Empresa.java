package practico_5_5;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Empleado> empleados;
	private double sueldos;
	// la empresa es quien define con cuantas ventas paga bono y valor del bono
	private int ventasRequeridasBono;

	public Empresa(String nombre) {
		this.nombre = nombre;
		empleados = new ArrayList<Empleado>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public double getSueldos() {
		return sueldos;
	}

	public void setSueldos(double sueldos) {
		this.sueldos = sueldos;
	}

	public double getSumatoriaSueldos() {
		double sumaSueldos = 0;
		for (int i = 0; i < empleados.size(); i++) {
			sumaSueldos += empleados.get(i).getSueldo();
		}
		return sumaSueldos;
	}

	public int getVentasRequeridas() {
		return this.ventasRequeridasBono;
	}
	
	public void setVentasRequeridas(int ventasRequeridas) {
		this.ventasRequeridasBono = ventasRequeridas;
	}

	// controla si corresponde bono, consultando al empleado si supera las ventas
	// requeridas
	public boolean correspondeBono(EmpleadoBono eb, int ventasRequeridasBono) {
		return (eb.getCantidadVentas() >= ventasRequeridasBono);
	}

}
