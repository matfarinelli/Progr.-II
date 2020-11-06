package practico_7_4;

public class CriterioNombreVulgar implements Criterio {

	private String nombreVulgar;
	
	public CriterioNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
	
		
	@Override
	public boolean cumple(Planta planta) {
		return planta.getNombresVulgares().contains(this.nombreVulgar); 
	}

}
