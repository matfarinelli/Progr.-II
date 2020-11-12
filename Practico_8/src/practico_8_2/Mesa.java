package practico_8_2;

import java.util.ArrayList;

public class Mesa extends SistemaElectoral {

	private ArrayList<Integer> padron; // padrón
	private ArrayList<Voto> votosEmitidos;

	public Mesa() {
		this.padron = new ArrayList<>();
		this.votosEmitidos = new ArrayList<>();
	}

	public void addVotante(int dni) {
		if (!this.padron.contains(dni)) {
			padron.add(dni);
		}
	}

	@Override
	public int getCantidadVotos(Candidato c1) {
		int cantidadVotos = 0;
		for (Voto voto : this.votosEmitidos) {
			if (c1.equals(voto.getVotado())) {
				cantidadVotos++;
			}
		}
		return cantidadVotos;
	}

	@Override
	public int getVotosTotales() {
		return this.votosEmitidos.size();
	}

	@Override
	public double getPorcentajeVotos(Candidato c1) {
		return ((double) this.getCantidadVotos(c1) / (double) this.getVotosTotales()) / 100;
	}

	@Override
	public int getVotosEnBlanco() {
		int votosBlancos = 0;
		for (Voto votito : this.votosEmitidos) {
			if (votito.isBlanco()) {
				votosBlancos++;
			}
		}
		return votosBlancos;
	}



}
