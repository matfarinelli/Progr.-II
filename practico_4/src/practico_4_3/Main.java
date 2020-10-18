package practico_4_3;

public class Main {

	public static void main(String[] args) {

		System.out.println("Empleado sueldo fijo:");
		Empleado e1 = new Empleado("Matias", 500);

		System.out.println(e1.getNombre() + " " + e1.getSueldoFijoSemanal());

		System.out.println("Empleado horas extras:");
		EmpleadoHorasExtras ehe1 = new EmpleadoHorasExtras("Maite", 500, 5, 30);

		System.out.println(ehe1.getSueldoFijoSemanal() + " " + ehe1.getValorHora() + " " + ehe1.getHorasExtras());

		System.out.println(ehe1.getNombre() + " " + ehe1.calcularSueldo());
		
		System.out.println("Empleado por comision:");
		EmpleadoComision ec1 = new EmpleadoComision("Lucas", 500, 0.02, 16900);
		
		System.out.println(ec1.getNombre() + " " + ec1.calcularSueldo());
		

	}

}
