package estrategias;

import practico_especial.Atributo;
import practico_especial.Carta;

public class Obstinado extends Estrategia {

	private String atributo;

	public Obstinado(String atributo) {
		this.atributo = atributo;

	}

	@Override
	public Atributo eligeAtributo(Carta c) {

		return c.getAtributo(atributo);

	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

}
