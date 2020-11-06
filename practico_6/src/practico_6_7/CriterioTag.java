package practico_6_7;

public class CriterioTag extends Criterio {

	private String tag;

	public CriterioTag(String tag) {
		this.tag = tag;
	}

	@Override
	public boolean cumple(Documento documento) {
		return (documento.tieneTag(this.tag.toUpperCase()));
	}

}
