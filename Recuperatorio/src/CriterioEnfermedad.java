
public class CriterioEnfermedad implements Criterio {

	private String enfermedadBuscada;

	public CriterioEnfermedad(String enfermedadBuscada) {
		this.enfermedadBuscada = enfermedadBuscada;
	}

	@Override
	public boolean cumple(Voluntario voluntario) {
		return voluntario.tuvoEnfermedad(this.enfermedadBuscada);
	}

}
