package practico_6_3;

import java.time.LocalDate;

public class Automovil extends Producto {

	public Automovil(String nombre) {
		super(nombre);
	}

	// consultar -> supuse que los productos podían alquilarse por "x" cantidad de
	// días.

	@Override
	public void alquilar(int dia, int mes, int anio, int dias_alquiler) {
		this.fechaAlquiler = LocalDate.of(anio, mes, dia);
		this.fechaVencimiento = this.fechaAlquiler.plusDays(dias_alquiler);
		this.setDisponibilidad(false);
	}
	@Override
	public void devolucion() {
		this.fechaAlquiler = null;
		this.fechaVencimiento = null;
		this.setDisponibilidad(true);
	}

}
