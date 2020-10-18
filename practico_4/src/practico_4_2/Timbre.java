package practico_4_2;

public class Timbre {

	private boolean estado;

	// constructor

	public Timbre() {
		this.estado = false;
	}

	// metodos

	public void hacerSonar() {
		this.estado = true;
		System.out.println("SONANDO! (desde timbre)"); // esta mal, pero como para ver algo
	}

	public void apagar() {
		this.estado = false;
	}

	// devuelve situacion del timbre

	public boolean isEstado() {
		return estado;
	}

}
