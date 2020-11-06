package practico_6_4;

import java.util.ArrayList;

public class MAL_ColaComputadora {

	private ArrayList<Computadora> computadoras;

	public MAL_ColaComputadora() {
		this.computadoras = new ArrayList<>();
	}

	public void agregarComputadora(Computadora nuevaComputadora) {
		for (int i = 0; i < computadoras.size(); i++) {
			Computadora computadoraIndividual = this.computadoras.get(i);
			if (computadoraIndividual.getVelocidadCPU() < nuevaComputadora.getVelocidadCPU()) {
				this.computadoras.add(i, nuevaComputadora);
				return;
			}
		}
		this.computadoras.add(nuevaComputadora);
	}

	
	public Computadora siguiente() {
		if (!this.computadoras.isEmpty()) {
			return computadoras.remove(0);
		}
		else 
			return null;
	}
}
