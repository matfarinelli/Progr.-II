package practico_5_3;

public class Pastura extends Cereal {

	final private int HECTAREAS_REQUERIDAS = 50;

	public Pastura(String nombre, String tipo) {
		super(nombre, tipo);
	}

	@Override
	public boolean tieneMineral(Lote lote) {
		return (super.tieneMineral(lote) && (lote.getHectareas() >= HECTAREAS_REQUERIDAS));
	}

}
