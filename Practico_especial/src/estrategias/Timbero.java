package estrategias;

import practico_especial.Atributo;
import practico_especial.Carta;

public class Timbero extends Estrategia {

	public Timbero() {
	}

	@Override
	public Atributo eligeAtributo(Carta c) {
		Atributo a = c.getAtributoRandom(c);
		return a;
	}

}
