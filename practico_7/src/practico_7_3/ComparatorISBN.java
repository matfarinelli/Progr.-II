package practico_7_3;
import java.util.Comparator;

public class ComparatorISBN implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		//return o1.getIsbn() - o2.getIsbn();
		return Integer.compare(o1.getIsbn(), o2.getIsbn());
	}

}
