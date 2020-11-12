package practico_8_2;

public abstract class SistemaElectoral {

	public abstract int getCantidadVotos(Candidato c1);

	public abstract double getPorcentajeVotos(Candidato c1);

	public abstract int getVotosTotales();

	public abstract int getVotosEnBlanco();

	public double getPorcentajeVotosEnBlanco() {
		return (double) this.getPorcentajeVotosEnBlanco() / (double) this.getVotosTotales() * 100;
	}
}
