package practico_6_3;

public class Main {

	public static void main(String[] args) {

		Videoclub vc = new Videoclub("VideoCar");

		Producto a1 = new Automovil("Ford Ka");
		Producto a2 = new Automovil("Chevrolet Cruze");

		vc.addProducto(a1);
		vc.addProducto(a2);
		System.out.println(vc.getProductos());

		// pregunto si estan disponibles
		System.out.println(a1.getDisponibilidad());
		System.out.println(a2.getDisponibilidad());

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
		Pelicula p1 = new Pelicula("Titanic", 5);

		// forzar error de stock para alquilar
		p1.alquilar(10, 10, 2020, 1);
		p1.alquilar(11, 10, 2020, 1);
		p1.alquilar(12, 10, 2020, 1);
		p1.alquilar(12, 10, 2020, 1);
		p1.alquilar(12, 10, 2020, 1);
		p1.alquilar(12, 10, 2020, 1);
		System.out.println(p1.getCantidadCopias());
		p1.devolucion();
		p1.devolucion();
		System.out.println(p1.getCantidadCopias());

	}

}
