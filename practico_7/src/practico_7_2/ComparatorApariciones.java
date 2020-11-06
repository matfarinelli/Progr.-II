package practico_7_2;

import java.util.Comparator;

public class ComparatorApariciones implements Comparator<Palabra> {

	@Override
	public int compare(Palabra p1, Palabra p2) {
		return Integer.compare(p1.getApariciones(), p2.getApariciones());

		// o
		// return p1.getApariciones() - p2.getApariciones();
	}

}
