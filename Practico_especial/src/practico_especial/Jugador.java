package practico_especial;

public class Jugador {

	private String nombre;
	private Mazo mazoPropio;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.mazoPropio = mazoPropio;
	}

	public String getNombre() {
		return this.nombre;
	}

	/*
	 * Metodos
	 */

	public void addCarta(Carta carta) {
		this.mazoPropio.addCarta(carta);
	}

	public int getSize() {
		return this.mazoPropio.getSize();
	}

}
