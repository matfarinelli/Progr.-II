package practico_4_bis;

public class Luz {

	private boolean estado;

	public Luz() {
		this.setEstado(false);
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean encender() {
		return this.estado = true;
	}

}
