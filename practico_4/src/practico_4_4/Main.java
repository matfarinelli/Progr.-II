package practico_4_4;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Matias", "Farinelli", 351653, 19, 01, 1989, "En pais de origen");
		System.out.println(p1.getDatos());

		System.out.println("********Separador********");

		Futbolista f1 = new Futbolista("Fernando", "Cavenaghi", 165582, 10, 10, 1980, "En concentracion", "Delantero",
				"Derecho", 120);
		System.out.println(f1.getDatos());

		System.out.println("********Separador********");

		Entrenador e1 = new Entrenador("Marcelo", "Gallardo", 1399031, 18, 12, 1977, "En concentracion", "Argentina");
		System.out.println(e1.getDatos());

		System.out.println("********Separador********");
		Masajista m1 = new Masajista("Juana", "Contractura", 3330, 25, 02, 1964, "En pais de origen", "Kinesiologo",
				31);
		// System.out.println(m1.getEstado());
		// System.out.println(m1.isDisponible());
		System.out.println(m1.getDatos());

	}

}
