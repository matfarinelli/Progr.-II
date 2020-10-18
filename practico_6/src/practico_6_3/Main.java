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
		a1.alquilar(15, 10, 2020, 5);

		// pregunto si está disponible
		System.out.println(a1.getDisponibilidad());

		// pregunto si esta vencido
		System.out.println("*" + a1.estaAlquilerVencido_());

	}

}
