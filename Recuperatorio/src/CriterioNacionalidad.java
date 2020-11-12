
public class CriterioNacionalidad implements Criterio {

	private String nacionalidadBuscada;

	public CriterioNacionalidad(String nacionalidadBuscada) {
		this.nacionalidadBuscada = nacionalidadBuscada;
	}

	@Override
	public boolean cumple(Voluntario voluntario) {
		return voluntario.getNacionalidad().equals(this.nacionalidadBuscada);
	}
}
