package practico_6_2;

public class EstacionMeteorologicaTandil extends EstacionMeteorologica {

	private int cantRegistrosLluvia;
	private double mmLluvia;
	private int cantRegistrosTemperatura;
	private double minTemperatura;

	public EstacionMeteorologicaTandil(String ciudad, Sensor temperatura, Sensor lluvia, Sensor humedad, Sensor viento,
			int cantRegistrosLluvia, double mmLluvia, int cantRegistrosTemperatura, double minTemperatura) {
		super(ciudad, temperatura, lluvia, humedad, viento);
		this.cantRegistrosLluvia = cantRegistrosLluvia;
		this.mmLluvia = mmLluvia;
		this.cantRegistrosTemperatura = cantRegistrosTemperatura;
		this.minTemperatura = minTemperatura;
	}

	/*
	 * Setter y Getter
	 */

	public void setCantRegistrosLluvia(int cantRegistrosLluvia) {
		this.cantRegistrosLluvia = cantRegistrosLluvia;
	}

	public void setMmLluvia(double mmLluvia) {
		this.mmLluvia = mmLluvia;
	}

	public void setCantRegistrosTemperatura(int cantRegistrosTemperatura) {
		this.cantRegistrosTemperatura = cantRegistrosTemperatura;
	}

	public void setMinTemperatura(double minTemperatura) {
		this.minTemperatura = minTemperatura;
	}

	/*
	 * METODO
	 */

	@Override
	public boolean predecirLluvia() {
		return ((this.lluvia.ultimo() < this.mmLluvia)
				&& (this.temperatura.maximo(this.cantRegistrosTemperatura) > this.minTemperatura));
	}

}
