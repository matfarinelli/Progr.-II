package practico_6_7;

public class CriterioAutor extends Criterio {

	private String autor;

	public CriterioAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.tieneAutor(this.autor.toUpperCase());
	}

}
