package practico_6_3;

public class Pelicula extends Producto {

	private int cantidadCopias;

	public Pelicula(String nombre, int copias) {
		super(nombre);
		this.cantidadCopias = copias;
	}

	public int getCantidadCopias() {
		return cantidadCopias;
	}

	@Override
	public void meAlquilaron() {
		if (cantidadCopias > 0) {
			cantidadCopias--;
			if (cantidadCopias == 0) {
				this.setDisponibilidad(false);
			}
		} else
			System.out.println("Sin stock , no es posible alquilar");
	}

	@Override
	public void meDevolvieron() {
		cantidadCopias++;
		this.setDisponibilidad(true);
	}

}
