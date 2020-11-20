package Pocimas;

import java.util.ArrayList;

import practico_especial.Atributo;

public class PocimaCocktail extends Pocima {

	private ArrayList<Pocima> pocimas;

	public PocimaCocktail(String nombre) {
		super(nombre);
		this.pocimas = new ArrayList<>();
	}

	public void addPocima(Pocima pocima) {
		this.pocimas.add(pocima);
	}
	
	public ArrayList<Pocima> getNombresPocimas(){
		return new ArrayList<>(this.pocimas);
	}

	@Override
	public double atributoConPocima(Atributo atributo) {
		double suma = 0;

		for (Pocima pocima : this.pocimas) {
			suma += pocima.atributoConPocima(atributo);
		}

		return suma;
	}

}
