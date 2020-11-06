package practico_7_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class EstadisticasTexto {

	private ArrayList<Palabra> palabrasDelTexto;

	public EstadisticasTexto(String texto) {
		this.palabrasDelTexto = new ArrayList<>();
		StringTokenizer txt = new StringTokenizer(texto);
		int totalPalabras = 0;
		while (txt.hasMoreTokens()) {
			String palabra = txt.nextToken();
			addPalabra(palabra);
			totalPalabras++;
		}
	}

	public void addPalabra(String palabra) {
		//recorre el arreglo con foreach
		for (Palabra palabrita : this.palabrasDelTexto) {
			if (palabrita.getNombre().equals(palabra)) {
				palabrita.incrementar();
				return; // para salir
			}
			Palabra palabraNueva = new Palabra(palabra);
			this.palabrasDelTexto.add(palabraNueva);
		}
	}

	public int cantidadPalabrasDiferentes() {
		return this.palabrasDelTexto.size();
	}

	public ArrayList<Palabra> palabrasMasFrecuentes(int N) {

		Collections.sort(this.palabrasDelTexto, new ComparatorApariciones()); // ordena de menor a mayor
		Collections.reverse(this.palabrasDelTexto);

		ArrayList<Palabra> topN = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			topN.add(palabrasDelTexto.get(i));
		}

		return topN;

	}

	public ArrayList<Palabra> palabrasMenosFrecuentes(int N) {

		ArrayList<Palabra> topN = new ArrayList<>();
		Collections.reverse(topN);
		return topN;
	}

	public static void Main(String[] args) {
		EstadisticasTexto e1 = new EstadisticasTexto(
				"Cuando est�s ac�, tendr�s tu espacio\r\n" + "y una fr�gil forma de existir\r\n"
						+ "con verte nacer �c�mo hay quien puede ver\r\n" + "un mundo para destruir?\r\n"
						+ "Ojos que no ven, corazones que no sienten\r\n" + "y vos que est�s por venir.\r\n" + "\r\n"
						+ "A cada instante habr� un flor\r\n" + "y en cada flor habr� un instante\r\n"
						+ "en que la vida se desnude\r\n" + "ante esos ojos necios.\r\n" + "\r\n"
						+ "Cuando est�s ac� tendr�s tu tiempo\r\n" + "el mismo que no tiene fin\r\n"
						+ "�En un mundo as�, donde est� tu lugar\r\n" + "qui�n puede el agua pudrir?\r\n"
						+ "Ojos que no ven, corazones que no sienten\r\n" + "y vos que est�s por venir.\r\n" + "\r\n"
						+ "Cuando est�s ac�, tendr�s tu espacio,\r\n" + "tu tiempo y algo por qu� luchar\r\n"
						+ "al verte crecer y hacerte fuerte\r\n" + "�Qui�n m�s le puede temer?\r\n"
						+ "A esos ojos que no ven, corazones que no sienten\r\n" + "si vos ya est�s ac�");

	}
}
