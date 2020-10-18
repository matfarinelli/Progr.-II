package practico_6_3;

import java.time.LocalDate;

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
	public void alquilar(int dia, int mes, int anio, int dias_alquiler) {
		if (cantidadCopias > 0) {
			this.fechaAlquiler = LocalDate.of(anio, mes, dia);
			this.fechaVencimiento = this.fechaAlquiler.plusDays(dias_alquiler);
			cantidadCopias--;
			if (cantidadCopias == 0) {
				this.setDisponibilidad(false);
			}
		} else
			System.out.println("Sin stock , no es posible alquilar");
	}

	@Override
	public void devolucion() {
		this.fechaAlquiler = null;
		this.fechaVencimiento = null;
		cantidadCopias++;
		this.setDisponibilidad(true);
	}

}
