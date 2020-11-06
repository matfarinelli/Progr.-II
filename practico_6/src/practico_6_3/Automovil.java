package practico_6_3;

import java.time.LocalDate;

public class Automovil extends Producto {

	public Automovil(String nombre) {
		super(nombre);
	}


	@Override
	public void meAlquilaron() {
		this.setDisponibilidad(false);
	}
	@Override
	public void meDevolvieron() {
		this.setDisponibilidad(true);
	}

}
