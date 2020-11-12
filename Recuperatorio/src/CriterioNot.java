
public class CriterioAnd implements Criterio {

	private Criterio criterioANegar;

	public CriterioAnd(Criterio criterioANegar) {
		this.criterioANegar = criterioANegar;
	}

	@Override
	public boolean cumple(Voluntario voluntario) {
		return !criterioANegar.cumple(voluntario);
	}

}
