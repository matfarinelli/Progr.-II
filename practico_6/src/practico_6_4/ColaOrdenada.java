package practico_6_4;

import java.util.ArrayList;

public class ColaOrdenada {

	private ArrayList<ElementoOrdenable> elementos;

	public ColaOrdenada() {
		this.elementos = new ArrayList<>();
	}

	public void agregar(ElementoOrdenable elemento_comparativo) {
		for (int i = 0; i < elementos.size(); i++) {
			ElementoOrdenable elemento = this.elementos.get(i); // individualizo el elemento
			if (elemento.isMenor(elemento_comparativo)) {
				this.elementos.add(i, elemento_comparativo);
				return;
			}
		}
		this.elementos.add(elemento_comparativo);
	}

	public Object siguiente() {
		if (!this.elementos.isEmpty()) {
			return elementos.remove(0);
		} else
			return null;
	}

	public int tamanio() {
		return this.elementos.size();
	}

}
