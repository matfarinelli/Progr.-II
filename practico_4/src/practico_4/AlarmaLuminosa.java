package practico_4;

public class AlarmaLuminosa extends Alarma {

	private boolean estado;
	
	public AlarmaLuminosa() {
		this.estado = false;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void disparar(Luz luz) {
		luz.encender();
	}
	
}
