package practico_4_2;

public class Sensor {

	private String zona;
	private boolean estado;

	// constructores

	public Sensor(String zona) {
		this.estado = false;
		this.zona = zona;
	}

	// getter y setters

	public void setZona(String zona) {
		this.zona = zona;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean getEstado() {
		return estado;
	}

	public String getZona() {
		return zona;
	}

	// metodos

	public boolean chequear() {
		if (this.estado == true) {
			//System.out.println("ALERTA (desde sensor - llamo a Timbre)");
			return true;
		} else {
			//System.out.println("Todo en orden");
			return false; 
		}
	}

}
