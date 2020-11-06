package practico_6_7;

public class CriterioPalabra extends Criterio {

	private String palabra;

	public CriterioPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Documento documento) {
		if ((documento.getTitulo().toUpperCase().contains(palabra.toUpperCase()))
				|| (documento.getContenido().toUpperCase().contains(palabra.toUpperCase()))
				|| (documento.getTags().contains(palabra))) {
			return true;
		} else
			return false;
	}

}
