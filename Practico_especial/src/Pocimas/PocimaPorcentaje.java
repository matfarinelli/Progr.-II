package Pocimas;

import practico_especial.Atributo;

public class PocimaPorcentaje extends Pocima {

	private double porcentaje;

	public PocimaPorcentaje(String nombre, double porcentaje) {
		super(nombre);
		this.porcentaje = porcentaje;
	}

	@Override
	public double atributoConPocima(Atributo atributo) {
		return atributo.getValor() * (1 + porcentaje);
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

}
