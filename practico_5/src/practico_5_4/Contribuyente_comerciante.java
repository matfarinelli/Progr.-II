package practico_5_4;

public class Contribuyente_comerciante extends Contribuyente_simple {

	private double alicuota_fijo;
	private double ventas;
	private double alicuota_ventas;

	public Contribuyente_comerciante(String nombre, int cuit, double montoFijo, double ventas, double alicuota_ventas,
			double alicuota_fijo) {
		super(nombre, cuit, montoFijo);
		this.alicuota_fijo = alicuota_fijo;
		this.alicuota_ventas = alicuota_ventas;
		this.ventas = ventas;

	}

	public double getAlicuota_fijo() {
		return alicuota_fijo;
	}

	public void setAlicuota_fijo(double alicuota_fijo) {
		this.alicuota_fijo = alicuota_fijo;
	}

	public double getAlicuota_ventas() {
		return alicuota_ventas;
	}

	public void setAlicuota_ventas(double alicuota_ventas) {
		this.alicuota_ventas = alicuota_ventas;
	}

	@Override
	public double getImpuesto() {

		return (super.getImpuesto() * alicuota_fijo) + (ventas * alicuota_ventas);

	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

}
