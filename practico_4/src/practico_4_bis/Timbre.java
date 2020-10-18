package practico_4_bis;

public class Timbre {

	private boolean estado;

	public Timbre() {
		this.setEstado(false);
	}

	public boolean hacerSonar() {
		this.estado = true;
		return estado;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
