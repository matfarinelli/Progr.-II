package practico_4_3;

public class Empleado {

	private double sueldoFijoSemanal;
	private String nombre;

	// constructores
	public Empleado(double sueldoFijoSemanal) {
		this.setSueldoFijo(sueldoFijoSemanal);
	}

	public Empleado(String nombre, double sueldoFijoSemanal) {
		this(sueldoFijoSemanal);
		this.setNombre(nombre);
	}

	// getter y setters
	public void setSueldoFijo(double sueldoFijoSemanal) {
		this.sueldoFijoSemanal = sueldoFijoSemanal;
	}

	public double getSueldoFijoSemanal() {
		return sueldoFijoSemanal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodo para calcular sueldo
	public double calcularSueldo() {
		return this.getSueldoFijoSemanal();
	}

	

}
