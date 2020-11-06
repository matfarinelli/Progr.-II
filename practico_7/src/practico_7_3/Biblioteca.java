package practico_7_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Biblioteca {

	private ArrayList<Libro> libros;

	/*
	 * Constructor
	 */

	public Biblioteca() {
		this.libros = new ArrayList<>();
	}

	/*
	 * métodos
	 */

	public void addLibro(Libro nuevoLibro) {

		// deberia ver que no esté repetido antes de agregar
		for (Libro libro : this.libros) {
			if (libro.equals(nuevoLibro)) {
				// System.out.println("Libro ya cargado");
				return;
			}
		}

		this.libros.add(nuevoLibro);
	}

	// consultar, si debo devolver una copia del array.
	public ArrayList<Libro> getLibros() {

		ArrayList<Libro> ordenados = new ArrayList<>();
		ordenados.addAll(this.libros);

		Collections.sort(ordenados, new ComparatorISBN());

		return ordenados;

	}

	/*
	 * Métodos para ordenar
	 */

	public ArrayList<Libro> getLibrosPorAutor() {
		ArrayList<Libro> ordenados = new ArrayList<>(this.libros);

		Collections.sort(ordenados, new ComparatorPorAutor());

		return ordenados;

	}

	public ArrayList<Libro> getLibrosPorGenero() {
		ArrayList<Libro> ordenados = new ArrayList<>(this.libros);

		Collections.sort(ordenados, new ComparatorPorGenero());

		return ordenados;
	}

	public ArrayList<Libro> getLibrosPorAno() {
		ArrayList<Libro> ordenados = new ArrayList<>(this.libros);

		Collections.sort(ordenados, new ComparatorPorAno());

		return ordenados;
	}

	// unico metodo y paso los comparadores por parametro

	public ArrayList<Libro> getLibrosOrdenados(Comparator<Libro> comparador) {
		ArrayList<Libro> ordenados = new ArrayList<>(this.libros);

		Collections.sort(ordenados, comparador);

		return ordenados;
	}

	public ArrayList<Libro> getLibrosDescendente(Comparator<Libro> comparador) {
		ArrayList<Libro> ordenados = new ArrayList<>(this.libros);

		Collections.sort(ordenados, Collections.reverseOrder(comparador));

		return ordenados;
	}

	/*
	 * Main
	 */

	public static void main(String[] args) {

		Biblioteca b1 = new Biblioteca();

		Libro l1 = new Libro("El psicoanalista", "John Katzenbach", 31, 2007, "Thriller");
		Libro l3 = new Libro("El Elemento", "Ken Robinson", 11, 2001, "Inspiracional");
		Libro l4 = new Libro("El psicoanalista", "John Katzenbach", 60, 2009, "Thriller");
		Libro l5 = new Libro("El Elemento", "Autor desconocido", 53, 2002, "Inspiracional");
		Libro l2 = new Libro("El psicoanalista", "John Katzenbach", 1, 2009, "Thriller");
		Libro l6 = new Libro("Clean Eating", "Hanna Frey", 3, 2020, "Nutrición");
		Libro l8 = new Libro("Cerebro de pan", "David perlmutter", 63, 2018, "Nutrición");
		Libro l7 = new Libro("El principito", "Antoine de Saint Exupery", 1, 1850, "Clasico");
		Libro l9 = new Libro("Codigo Da Vinci", "Dan Brown", 21, 2004, "Thriller");
		Libro l10 = new Libro("El corazon del Yoga", "Desikachar", 9, 1997, "Yoga");

		b1.addLibro(l1);
		b1.addLibro(l2);
		b1.addLibro(l3);
		b1.addLibro(l4);
		b1.addLibro(l5);
		b1.addLibro(l6);
		b1.addLibro(l7);
		b1.addLibro(l8);
		b1.addLibro(l9);
		b1.addLibro(l10);

		// primera resolución con varios GET

		// System.out.println(b1.getLibros());
		// System.out.println(" * * * * * * * * * * * * * * ");
		// System.out.println(b1.getLibrosPorAutor());
		// System.out.println(" * * * * * * * * * * * * * * ");
		// System.out.println(b1.getLibrosPorGenero());
		// System.out.println(b1.getLibrosPorAno());

		// segunda resolucion pasando comparator por parámetro

		// orden por defecto
		// System.out.println(b1.getLibros());
		// System.out.println("**************************");
		// Comparator<Libro> porAutor = new ComparatorPorAutor();
		// System.out.println(b1.getLibrosOrdenados(porAutor));
		// System.out.println("**************************");
		Comparator<Libro> porAno = new ComparatorPorAno();
		// System.out.println(b1.getLibrosOrdenados(porAno));
		// System.out.println("**************************");
		// Comparator<Libro> porGenero = new ComparatorPorGenero();
		// System.out.println(b1.getLibrosOrdenados(porGenero));

		// orden descendente
		System.out.println(b1.getLibrosDescendente(porAno));

	}
}