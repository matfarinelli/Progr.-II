package estrategias;

import practico_especial.Atributo;
import practico_especial.Carta;

public class Ambicioso extends Estrategia {

	public Ambicioso() {
	}

	@Override
	public Atributo eligeAtributo(Carta c) {
		Atributo a = c.getAtributoMax(c);
		return a;
	}

}
