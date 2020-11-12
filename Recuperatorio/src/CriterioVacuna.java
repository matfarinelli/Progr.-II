
public class CriterioVacuna implements Criterio {

	private boolean recibioVacuna; // mediante un criterioNot puedo saber si recibio vacuna o placebo (true vacuna)

	public CriterioVacuna(boolean recibioVacuna) {
		this.recibioVacuna = recibioVacuna;
	}
	
	
	@Override
	public boolean cumple(Voluntario voluntario) {
		return voluntario.isRecibioVacuna()==this.recibioVacuna;
		
	}

}
