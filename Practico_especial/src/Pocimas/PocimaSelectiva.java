package Pocimas;

import practico_especial.Atributo;

public class PocimaSelectiva extends Pocima {

	private String nombreAtributo;
	private double incremental;

	public PocimaSelectiva(String nombre, String nombreAtributo, double incremental) {
		super(nombre);
		this.nombreAtributo = nombreAtributo;
		this.incremental = incremental;
	}

	@Override
	public double atributoConPocima(Atributo atributo) {
		if (atributo.getNombre().equals(this.nombreAtributo)) {
			return atributo.getValor() * 1 + incremental;
		}
		return atributo.getValor();
	}

}
