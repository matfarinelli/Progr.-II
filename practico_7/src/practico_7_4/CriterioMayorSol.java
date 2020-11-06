package practico_7_4;

public class CriterioMayorSol implements Criterio {

	private int comparativo;

	public CriterioMayorSol(int comparativo) {
		this.comparativo = comparativo;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getSol() > this.comparativo;
	}

}
