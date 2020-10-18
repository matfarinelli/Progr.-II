package practico_3_2;

public class Electrodomestico {

	private String nombre;
	private double precio_base;
	private String color;
	private double consumo_energetico;
	private double peso;

	public Electrodomestico(String nombre) {
		this.nombre = nombre;
		this.precio_base = 100;
		this.color = "Gris plata";
		this.consumo_energetico = 10;
		this.peso = 2;
	}

	public Electrodomestico(String nombre, String color) {
		this(nombre);
		this.color = color;
	}

	public Electrodomestico(String nombre, String color, double precio_base) {
		this(nombre, color);
		this.precio_base = precio_base;
	}

	public Electrodomestico(String nombre, String color, double precio_base, double consumo_energetico) {
		this(nombre, color, precio_base);
		this.consumo_energetico = consumo_energetico;
	}

	public Electrodomestico(String nombre, String color, double precio_base, double consumo_energetico, double peso) {
		this(nombre, color, precio_base, consumo_energetico);
		this.peso = peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPrecio(double precio_base) {
		this.precio_base = precio_base;
	}

	public double getPrecio() {
		return precio_base;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setConsumo(double consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public double getConsumo() {
		return consumo_energetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	/*
	 * * * * * * * * * * * * * * * * Metodos * * * * * * * * * * * * * * * * * * * *
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 	 */

	public boolean isBajoConsumo() {
		return getConsumo() < 45;
	}

	// como redondear esto?
	public double isBalance() {
		double balance = (getConsumo() / getPeso());
		return balance;
	}
	
	public boolean isAltaGama() {
		return isBalance()>3;
	}
	

}
