package practico_7_4;

public class CriterioClasificacion implements Criterio {

	private String clasificacion;

	public CriterioClasificacion(String clasificacion) {
		this.clasificacion = clasificacion.toUpperCase();
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getClasificacionSuperior().equals(this.clasificacion);
	}

}
