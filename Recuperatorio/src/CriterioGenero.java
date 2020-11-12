
public class CriterioGenero implements Criterio {

	
	private boolean isVaron;

	//true varon, false mujer. 
	public CriterioGenero(boolean isVaron) {
		this.isVaron = isVaron;
	}

	@Override
	public boolean cumple(Voluntario voluntario) {
		return voluntario.isVaron() == this.isVaron;
	}
}


