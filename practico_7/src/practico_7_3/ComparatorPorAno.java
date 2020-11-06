package practico_7_3;

import java.util.Comparator;

public class ComparatorPorAno implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getAnoEdicion() - o2.getAnoEdicion();
	}

}
