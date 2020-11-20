package Pocimas;

import practico_especial.Atributo;

public class PocimaNumero extends Pocima {

	private double valor;

	public PocimaNumero(String nombre, double valor) {
		super(nombre);
		this.valor = valor;
	}

	@Override
	public double atributoConPocima(Atributo atributo) {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
