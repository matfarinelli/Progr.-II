package practico_7_4;

import java.util.Comparator;

public class OrdenadorRiego implements Comparator<Planta> {

	@Override
	public int compare(Planta o1, Planta o2) {
		return o1.getRiego() - o2.getRiego();
	}

}
