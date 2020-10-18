package practico_5_5;

public class Main {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Maite" , "Gelso" , 34150850 , 50000);
		Empleado_comision ec1 = new Empleado_comision("Matias" , "Farinelli" , 34296097 , 50000, 7500, 0.025);
		
		Empresa empresa = new Empresa("INC");
		empresa.addEmpleado(e1);
		empresa.addEmpleado(ec1);
	
		System.out.println(e1.getSueldo());
		System.out.println(ec1.getSueldo());
		
		System.out.println(empresa.getSumatoriaSueldos());
		
		System.out.println("******************");
		
		empresa.setVentasRequeridas(100);
		EmpleadoBono eb1 = new EmpleadoBono("Camila" , "Farinelli" , 37018654 , 70000, 130, 10000, empresa);
		System.out.println(eb1.correspondeBono());
		System.out.println(eb1.getSueldo());
	
	}

}
