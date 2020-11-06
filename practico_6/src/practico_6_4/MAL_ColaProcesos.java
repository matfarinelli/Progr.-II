package practico_6_4;

import java.util.ArrayList;

public class MAL_ColaProcesos {

	private ArrayList<Proceso> procesos;

	public MAL_ColaProcesos() {
		this.procesos = new ArrayList<>();
	}

	public void agregarProceso(Proceso nuevoProceso) {
		// en posicion cero deberia estar el proceso mas prioritario
		for (int i = 0; i < this.procesos.size(); i++) {
			Proceso procesoIndividual = this.procesos.get(i);
			if (procesoIndividual.getRequerimientosDeMemoria() < nuevoProceso.getRequerimientosDeMemoria())
				this.procesos.add(i, nuevoProceso);
			return; // es para cortar la ejecucion
		}
		// por si es el que menos memoria requiere
		this.procesos.add(nuevoProceso);
	}
	
	
	public Proceso siguiente() {
		if (!this.procesos.isEmpty()) {
			Proceso siguiente = this.procesos.get(0); //el primero de la lista
			this.procesos.remove(0);
			return siguiente;
		} else {
			return null; // estaria vacío y no habría procesos pendientes
		}
	}
}
