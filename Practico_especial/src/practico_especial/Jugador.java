package practico_especial;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private Mazo mazoPropio;
	private int puntos;
	private boolean ganoUltima;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.mazoPropio = new Mazo();
		this.puntos = 0;
		this.ganoUltima= true;
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
	public void addCartaGanada(Carta carta) {
		this.mazoPropio.addCartaGanada(carta);
	}
	
	public int getSizeMazo() {
		return this.mazoPropio.getSize();
	}

	// muestra el nombre solo para control
	public Carta jugarTurno() {
		Carta c1 = this.mazoPropio.getCartaAJugar();
		return c1;
	}
	
	public ArrayList<Carta> getMazoPropio(){
		return this.mazoPropio.getCartas();
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void sumarPunto() {
		this.puntos ++;
	}
	
	
	

}
