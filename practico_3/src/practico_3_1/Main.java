package practico_3_1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona(33788989);
		p1.setNombre("Lucas");
		p1.setApellido("Bini");
		p1.mostrarDatos();

		// ¿como se pasa un LocalDate por parametro?

		//Persona p2 = new Persona("Matias", "Farinelli", 34296907, "masculino", LocalDate.of(1989, 01, 19), 1.69, 70);

		//p2.mostrarDatos();
		//System.out.println(p2.getMasaCorporal());
		//System.out.println(p2.getNombre() + " " + p2.isForma());

		Persona p3 = new Persona("Maite", "Gelso", 34150850, "femenino", 16, 11, 1988, 1.63, 54);

		p3.mostrarDatos();
		System.out.println(p3.getNombre() + ", masa corporal: " + p3.getMasaCorporal());

		Persona p4 = new Persona(35017996, "Jacobo", "Winograd");
		p4.mostrarDatos();
		p4.setPeso(99);
		p4.setAltura(1.77);
		System.out.println(p4.getNombre() + " " + p4.isForma());
		System.out.println("Su masa corporal es: " + p4.getMasaCorporal());
		System.out.println("---------");

		Persona p5 = new Persona("Mirta", "Dinosaurio", 16258015, 02, 10, 1006);
		System.out.println("¿Es su cumpleaños? " + p5.isCumpleaños());
		System.out.println("La edad de la vieja es: " + p5.getEdad() + " años.");

		System.out.println(p3.getDatos());
		
		Persona p6 = new Persona(49158640);
		p6.setFechaNacimiento(15,10,2000);
		p6.setEdad_declarada(19);
		System.out.println(p6.getDatos());
		System.out.println("La edad declarada es coherente? :" + p6.edadCoherente());
		System.out.println("Puede votar? " + p6.puedeVotar());
		System.out.println("Es mayor? " + p6.isMayor());
	}

}
