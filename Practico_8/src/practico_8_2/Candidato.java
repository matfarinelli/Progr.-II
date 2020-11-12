package practico_8_2;

public class Candidato {

	private String nombre;
	private	String partido;
	private String agrupacion;
	
	public Candidato(String nombre, String partido, String agrupacion) {
		this.nombre = nombre;
		this.partido = partido;
		this.agrupacion = agrupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getAgrupacion() {
		return agrupacion;
	}

	public void setAgrupacion(String agrupacion) {
		this.agrupacion = agrupacion;
	}
}
