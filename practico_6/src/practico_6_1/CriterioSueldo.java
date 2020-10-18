package practico_6_1;

public class CriterioSueldo extends Criterio {

	private double sueldo;

	public CriterioSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public boolean evaluarContrato(Contrato contrato) {
		return this.sueldo < contrato.getSueldo();
	}

}
