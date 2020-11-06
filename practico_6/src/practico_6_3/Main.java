package practico_6_3;

public class Main {

	public static void main(String[] args) {

		Videoclub vc = new Videoclub("VideoCar");

		Producto a1 = new Automovil("Ford Ka");
		Producto a2 = new Automovil("Chevrolet Cruze");
		Pelicula p1 = new Pelicula("Mememto", 5);
		Pelicula p2 = new Pelicula("Superman", 2);
		Pelicula p3 = new Pelicula("Finding Nemo", 1);

		Cliente c1 = new Cliente("Juan");
		Cliente c2 = new Cliente("Matías");
		Cliente c3 = new Cliente("Paola");
		Cliente c4 = new Cliente("Mirta");

		vc.addProducto(a1);
		vc.addProducto(a2);
		vc.addProducto(p1);
		vc.addProducto(p2);
		vc.addProducto(p3);
		System.out.println("1- " + vc.getProductos());

		// pregunto si estan disponibles
		// System.out.println("2- " + a1.getDisponibilidad());
		// System.out.println("3- " + a2.getDisponibilidad());

		// alquilo el ford ka
		a1.alquilar(15, 10, 2020, 2);

		// pregunto si está disponible
		System.out.println(a1.getNombre() + " disponible: " + a1.getDisponibilidad());
		System.out.println(a2.getNombre() + " disponible: " + a2.getDisponibilidad());

		// pregunto si esta vencido
		System.out.println(a1.getNombre() + " alquiler vencido: " + a1.estaAlquilerVencido_());

		// devolución auto
		a1.devolucion();
		System.out.println(a1.getFechaAlquiler());
		System.out.println(a1.getFechaVencimiento());
		System.out.println(a1.getNombre() + " disponible: " + a1.getDisponibilidad());

		System.out.println("*** Peliculas ***");

		p1.alquilar(10, 10, 2020, 1);
		p1.alquilar(11, 10, 2020, 1);
		p1.alquilar(12, 10, 2020, 1);
		p1.alquilar(12, 10, 2020, 1);
		p1.alquilar(12, 10, 2020, 1);
		System.out.println("4- " + p1.getCantidadCopias());
		// forzar error de stock para alquilar
		p1.alquilar(12, 10, 2020, 1);
		p1.devolucion();
		p1.devolucion();
		System.out.println("5- " + p1.getCantidadCopias());

		
		System.out.println("********");
		
		Alquiler al1 = new Alquiler(15,10,2020,5);
		System.out.println(al1.estaAlquilerVencido_());
		
		
		
	}

}
