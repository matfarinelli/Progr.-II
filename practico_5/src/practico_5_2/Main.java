package practico_5_2;

public class Main {

	public static void main(String[] args) {

		Alumno a1 = new Alumno("Harry");
		// consulta. No supe como pasar varias cualidades de una. Se puede?
		a1.setCualidades("rapido");
		a1.setCualidades("inteligente");
		a1.setCualidades("veloz");
		System.out.println(a1.getCualidades().toString());

		Escuela e1 = new Escuela();

		Casa c1 = new Casa("Griffindor");
		Casa c2 = new Casa("Slytherin");
		Casa c3 = new Casa("Hufflepuff");
		Casa c4 = new Casa("Ravenclaw");

		e1.agregarCasa(c1);
		e1.agregarCasa(c2);
		e1.agregarCasa(c3);
		e1.agregarCasa(c4);

		c1.agregarAlumno(a1);
		
		System.out.println(c1.casaLlena());
		
		System.out.println("*******");
		
		//c1.toString();
		System.out.println(c1);

	}

}
