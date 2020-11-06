package practico_7_4;

public class CriterioNombreCientifico implements Criterio {

	private String palabraEspecifica;

	public CriterioNombreCientifico(String palabraEspecifica) {
		this.palabraEspecifica = palabraEspecifica;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getNombre().equals(this.palabraEspecifica);
	}

}
