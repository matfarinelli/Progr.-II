package practico_6_1;

public class CriterioHoras extends Criterio {

	private int horasDisponibles;

	public CriterioHoras(int horasRequeridas) {
		this.horasDisponibles = horasRequeridas;
	}

	// devuelve true si las horas que tengo disponibles son menor o igual a las del contrato
	@Override
	public boolean evaluarContrato(Contrato contrato) {
		return this.horasDisponibles >= contrato.getHorasSemanales();
	}

	public int getHorasRequeridas() {
		return horasDisponibles;
	}

	public void setHorasRequeridas(int horasRequeridas) {
		this.horasDisponibles = horasRequeridas;
	}

}
