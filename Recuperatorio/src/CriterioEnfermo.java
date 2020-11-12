
public class CriterioEnfermo implements Criterio {

	private boolean seEnfermo;

	public CriterioEnfermo(boolean seEnfermo) {
		this.seEnfermo = seEnfermo;
	}

	@Override
	public boolean cumple(Voluntario voluntario) {
		return voluntario.isContrajoEnfermedad() == this.seEnfermo;
	}

}
