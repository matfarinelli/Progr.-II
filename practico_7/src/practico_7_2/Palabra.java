package practico_7_2;

public class Palabra {

	private String nombre;
	private int apariciones;

	public Palabra(String nombre) {
		this.nombre = nombre;
		this.apariciones = 0;
	}

	public void incrementar() {
		apariciones++;
	}

	public String getNombre() {
		return nombre;
	}

	public int getApariciones() {
		return apariciones;
	}

}
