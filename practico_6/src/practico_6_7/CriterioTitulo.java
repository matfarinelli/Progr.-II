package practico_6_7;

public class CriterioTitulo extends Criterio {

	private String valorBuscado;

	public CriterioTitulo(String valorBuscado) {
		this.valorBuscado = valorBuscado;
	}

	/*
	 * No busca con exactitud
	 * 
	 * @Override public boolean cumple(Documento documento) { return
	 * documento.getTitulo().contains(this.valorBuscado); }
	 */

	
	//hay que reimplementar equals
	@Override
	public boolean cumple(Documento documento) {
		return documento.getTitulo().toUpperCase().equals(this.valorBuscado.toUpperCase());
	}

}
