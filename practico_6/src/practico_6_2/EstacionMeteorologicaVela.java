package practico_6_2;

public class EstacionMeteorologicaVela extends EstacionMeteorologica {

	private double _humedad;

	public EstacionMeteorologicaVela(String ciudad, Sensor temperatura, Sensor lluvia, Sensor humedad, Sensor viento,
			double _humedad) {
		super(ciudad, temperatura, lluvia, humedad, viento);
		this._humedad = _humedad;
	}

	public double get_humedad() {
		return _humedad;
	}

	public void set_humedad(double _humedad) {
		this._humedad = _humedad;
	}

	@Override
	public boolean predecirLluvia() {
		return (this.humedad.ultimo() / 100 > this._humedad / 100);
	}

}
