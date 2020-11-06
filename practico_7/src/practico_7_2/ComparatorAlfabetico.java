package practico_7_2;

import java.util.Comparator;

public class ComparatorAlfabetico implements Comparator<Palabra> {

	@Override
	public int compare(Palabra p1, Palabra p2) {
		return p1.getNombre().compareTo(p2.getNombre());
	}

}
