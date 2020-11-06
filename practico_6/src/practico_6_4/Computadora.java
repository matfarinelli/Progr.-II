package practico_6_4;

public class Computadora extends ElementoOrdenable {

	private String modelo;
	private int velocidadCPU;

	public Computadora(String modelo, int velocidadCPU) {
		this.modelo = modelo;
		this.velocidadCPU = velocidadCPU;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadCPU() {
		return velocidadCPU;
	}

	public void setVelocidadCPU(int velocidadCPU) {
		this.velocidadCPU = velocidadCPU;
	}

	@Override
	public boolean isMenor(Object o) {
		Computadora compuComparable = (Computadora) o; // casteo "o" a Computadora
		if (this.getVelocidadCPU() < compuComparable.getVelocidadCPU()) {
			return true;
		} else
			return false;
	}

	public String toString() {
		return this.modelo + "," + this.velocidadCPU;
	}
	
}
