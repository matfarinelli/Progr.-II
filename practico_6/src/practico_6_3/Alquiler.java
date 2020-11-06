package practico_6_3;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler {

	protected LocalDate fechaAlquiler;
	protected LocalDate fechaVencimiento;
	
	public Alquiler(int dia, int mes, int anio, int diasAlquiler) {
		this.setFechaAlquiler(dia, mes, anio);
		this.setFechaVencimiento(diasAlquiler);
	}
	
	
	public void setFechaAlquiler(int dia, int mes, int anio) {
		this.fechaAlquiler = LocalDate.of(anio, mes, dia);
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	public void setFechaVencimiento(int diasAlquiler) {
		this.fechaVencimiento = fechaAlquiler.plusDays(diasAlquiler);
	}
	
	// no funciona (no se cual es mi error)
	public boolean estaAlquilerVencido() {
		if (this.fechaAlquiler.isAfter(this.fechaVencimiento) || (this.fechaAlquiler.isEqual(this.fechaVencimiento))) {
			// System.out.println(fechaAlquiler);
			// System.out.println(fechaVencimiento);
			return true;
		} else {
			// System.out.println(fechaAlquiler);
			// System.out.println(fechaVencimiento);
			return false;
		}
	}

	public boolean estaAlquilerVencido_() {
		LocalDate hoy = LocalDate.now();
		int diasRestantesAlquiler = Period.between(hoy, fechaVencimiento).getDays();

		if (diasRestantesAlquiler >= 0) {
			return false;
		} else
			return true;
	}
	
	
}
