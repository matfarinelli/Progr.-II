package practico_7_4;

import java.util.Comparator;

public class OrdenadorSol implements Comparator<Planta> {

	@Override
	public int compare(Planta p1, Planta p2) {
		return p1.getSol() - p2.getSol();
	}

}
