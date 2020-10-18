package practico_4;

public class Luz {

	private boolean prendida;

	public Luz() {
		this.prendida = false;
	}

	public boolean encender() {
		this.prendida = true;
		return prendida;
	}

	public void setPrendida(boolean estado) {
		this.prendida = estado;
	}

	public boolean isPrendida() {
		return prendida;
	}

}
