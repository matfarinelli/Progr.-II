package practico_8_2;

import java.util.ArrayList;

public class LugarVoto extends SistemaElectoral {
	
	private ArrayList<SistemaElectoral> lugares;

	public LugarVoto() {
		this.lugares = new ArrayList<>();
	}
	
	public void addHijo(SistemaElectoral se) {
		lugares.add(se);
	}

	@Override
	public int getCantidadVotos(Candidato c1) {
		int totalVotos = 0;
		for (SistemaElectoral lugar : this.lugares) {
			totalVotos+=lugar.getCantidadVotos(c1);
		}
		return totalVotos;
	}
	
	@Override
	public double getPorcentajeVotos(Candidato c1) {
		int totalVotosCandidato= this.getCantidadVotos(c1);
		int totalVotos = this.getVotosTotales();
		
		return (double)totalVotosCandidato/(double)totalVotos*100;
	}
	
	@Override
	public int getVotosTotales() {
		int votosTotales=0;
		for (SistemaElectoral lugar : this.lugares) {
			votosTotales += lugar.getVotosTotales();
		}
		return votosTotales;
	}
	
	@Override
	public int getVotosEnBlanco() {
		int votosEnBlanco= 0;
		for (SistemaElectoral lugar : this.lugares) {
			votosEnBlanco += lugar.getVotosEnBlanco();
		}
		return votosEnBlanco;
	}
	

	
}
