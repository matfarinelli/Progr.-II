package practico_6_1;

public class CriterioOr extends Criterio {

	private Criterio c1;
	private Criterio c2;

	public CriterioOr(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean evaluarContrato(Contrato contrato) {
		return (c1.evaluarContrato(contrato) || (c2.evaluarContrato(contrato)));
	}

}
