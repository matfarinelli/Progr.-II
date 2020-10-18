package practico_6_2;

public class EstacionMeteorologicaBB extends EstacionMeteorologica {

	private int registroVelocidadViento;
	private double registroLluvia;
	private int cantRegistrosHumedad;
	private int registroHumedad;

	public EstacionMeteorologicaBB(String ciudad, Sensor temperatura, Sensor lluvia, Sensor humedad, Sensor viento,
			double registroLluvia, int registroVelocidadViento, int cantRegistrosHumedad, int registroHumedad) {
		super(ciudad, temperatura, lluvia, humedad, viento);
		this.registroLluvia = registroLluvia;
		this.registroVelocidadViento = registroVelocidadViento;
		this.cantRegistrosHumedad = cantRegistrosHumedad;
		this.registroHumedad = registroHumedad;
	}

	public void setEstadisticaVelocidadVientoRegistrado(int registroVelocidadViento) {
		this.registroVelocidadViento = registroVelocidadViento;
	}

	public void setMmLluvia(double registroLluvia) {
		this.registroLluvia = registroLluvia;
	}

	public void setCantRegistrosHumedad(int cantRegistrosHumedad) {
		this.cantRegistrosHumedad = cantRegistrosHumedad;
	}

	@Override
	public boolean predecirLluvia() {
		return ((viento.ultimo() > this.registroVelocidadViento) && (lluvia.ultimo() < this.registroLluvia)
				&& (humedad.promedio(cantRegistrosHumedad)) < this.registroHumedad);
	}

}
