package practico_6_7;

import java.util.StringTokenizer;

public class CriterioCantidadPalabras extends Criterio {

	private int cantidadPalabras;

	public CriterioCantidadPalabras(int cantidadPalabras) {
		this.cantidadPalabras = cantidadPalabras;
	}

	@Override
	public boolean cumple(Documento documento) {
		String frase = documento.getContenido();
		StringTokenizer cantPalabras = new StringTokenizer(frase);
		int cantidad = cantPalabras.countTokens();
		return cantidad >= this.cantidadPalabras;
	}

}
