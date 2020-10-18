package practico_6_1;

public class CriterioExclusivo extends Criterio {

	private boolean exclusividad;

	@Override
	public boolean evaluarContrato(Contrato contrato) {
		return false;
	}
	
	// no acepta nada



}
