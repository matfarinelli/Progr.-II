import java.util.ArrayList;

public abstract class SistemaOMS {

	public abstract int getVoluntarios();

	public abstract int getVoluntariosPlacebo();

	public abstract int getVoluntariosVacuna();
	
	public abstract int getVoluntariosEnfermos();
	
	// con este "buscar" podemos combinar los filtros de busqueda para realizar las busquedas solicitadas en los incisos 
	public abstract int buscar(Criterio c);
	
	public abstract ArrayList<Voluntario> getVoluntariosAptos(Criterio c1);
	
	
	
	//inciso 6
	public double getPorcentajeVacunados() {
		int contadorVacunados = this.getVoluntariosVacuna();
		int contadorVoluntarios= this.getVoluntarios();
		
		return ((double)contadorVacunados/(double)contadorVoluntarios) * 100;
	}
	

	//inciso 7
	public double getPorcentajeEnfermosPlacebo() {
		int contadorEnfermos = this.getVoluntariosEnfermos();
		int contadorVoluntariosPlacebo= this.getVoluntariosPlacebo();
		
		return ((double)contadorEnfermos/(double)contadorVoluntariosPlacebo) * 100;
	}
	
	/*
	 * INCISO 8
	 * 
	 * CriterioA sería un criterioEdad(60)
	 * CriterioB un criterioGenero
	 * criterio1 = CriterioAnd(CriterioA, CriterioB)
	 * CriterioC un criterioNacionalidad
	 * CriterioD un criterioVacuna
	 * criterio2 = CriterioAnd(CriterioC, CriterioC)
	 * 
	 *  
	 * criterio = CriterioAnd(Criterio1, Criterio2)
	 */
		
	public double getPorcentajeSegunCriterios(Criterio c1, Criterio c2) {
		int contadorCriterio1 = this.buscar(c1);
		int contadorCriterio2= this.buscar(c2);
		
		return ((double)contadorCriterio1/(double)contadorCriterio2) * 100;
	}

	

}
