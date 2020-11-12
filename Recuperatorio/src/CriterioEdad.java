
public class CriterioEdad implements Criterio {

	private int edadBuscada;

	public CriterioEdad(int edadBuscada) {
		this.edadBuscada = edadBuscada;
	}

	@Override
	public boolean cumple(Voluntario voluntario) {
		return voluntario.getEdad() <= this.edadBuscada;
	}

}
