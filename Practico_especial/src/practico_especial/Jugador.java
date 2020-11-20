package practico_especial;

import java.util.ArrayList;

import estrategias.Estrategia;

public class Jugador {

	private String nombre;
	private Mazo mazoPropio;
	private int puntos;
	private Estrategia estrategia;

	private boolean ganoUltima;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.mazoPropio = new Mazo();
		this.puntos = 0;
		this.ganoUltima = true;

	}

	public boolean isGanoUltima() {
		return ganoUltima;
	}

	public void setGanoUltima(boolean ganoUltima) {
		this.ganoUltima = ganoUltima;
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

	public void removeCartaPerdida() {
		this.mazoPropio.eliminarCartaJugada();
	}

	/*
	 * public void addCartaGanada(Carta carta) {
	 * this.mazoPropio.addCartaGanada(carta); }
	 */

	public void ganarCarta(Carta carta1, Carta carta2) {
		this.mazoPropio.addCartaGanada(carta1);
		this.mazoPropio.addCartaGanada(carta2);
	}

	public void enviarCartaAlFinal(Carta carta) {
		this.mazoPropio.addCartaGanada(carta);
		this.removeCartaPerdida();
	}

	public int getSizeMazo() {
		return this.mazoPropio.getSize();
	}

	// muestra el nombre solo para control
	public Carta jugarTurno() {
		Carta c1 = this.mazoPropio.getCartaAJugar();

		return c1;
	}

	public Atributo elegirAtributo(Carta carta) {

		Atributo a1 = this.estrategia.eligeAtributo(carta);
		return a1;
	}

	public Atributo jugarDevolucion(Atributo atributoElegido) {
		Carta c2 = this.mazoPropio.getCartaAJugar();
		Atributo a2 = c2.getAtributo(atributoElegido.getNombre());
		return a2;
	}

	// borrar - fue solo control para ver el orden de las cartas recibidas
	public ArrayList<Carta> getMazoPropio() {
		return this.mazoPropio.getCartas();
	}

	public int getPuntos() {
		return puntos;
	}

	public void sumarPunto() {
		this.puntos++;
	}

	public Estrategia getEstrat() {
		return estrategia;
	}

	public void setEstrategia(Estrategia estrat) {
		this.estrategia = estrat;
	}

}
