package practico_6_7;

public class CriterioNot extends Criterio {

	private Criterio criterio;

	public CriterioNot(Criterio criterio) {
		this.criterio = criterio;
	}

	@Override
	public boolean cumple(Documento documento) {
		return (!criterio.cumple(documento));
	}

	

}
