package practico_6_2;

public abstract class EstacionMeteorologica {

	private String ciudad;
	protected Sensor temperatura;
	protected Sensor lluvia;
	protected Sensor humedad;
	protected Sensor viento;

	// private double lluviaAcumulada;

	public EstacionMeteorologica(String ciudad, Sensor temperatura, Sensor lluvia, Sensor humedad, Sensor viento) {
		this.ciudad = ciudad;
		this.temperatura = temperatura;
		this.lluvia = lluvia;
		this.humedad = humedad;
		this.viento = viento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public abstract boolean predecirLluvia();

}
