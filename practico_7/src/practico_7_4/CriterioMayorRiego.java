package practico_7_4;

public class CriterioMayorRiego implements Criterio {

	private int comparativo;

	public CriterioMayorRiego(int comparativo) {
		this.comparativo = comparativo;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getRiego() > this.comparativo;
	}

}
