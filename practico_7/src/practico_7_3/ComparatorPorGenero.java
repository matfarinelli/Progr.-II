package practico_7_3;

import java.util.Comparator;

public class ComparatorPorGenero implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getGenero().compareTo(o2.getGenero());
	}

}
