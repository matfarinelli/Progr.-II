package practico_3_1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	// private int dia, mes, anio; // fecha de nacimiento
	private LocalDate fecha_de_nacimiento;
	private int edad_declarada;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;
	private double masaCorporal;

	// 1 - constructor con DNI - y el que establece los valores por DEFECTO
	public Persona(int dni) {
		setNombre("N");
		setApellido("N");
		this.dni = (dni);
		setSexo("femenino");
		this.fecha_de_nacimiento = LocalDate.of(2000, 01, 01);
		setPeso(1);
		setAltura(1);
	}

	// 2 - constructor con DNI, nombre y apellido.
	public Persona(int dni, String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
		this.dni = (dni);
		setSexo("femenino");
		this.fecha_de_nacimiento = LocalDate.of(2000, 01, 01);
		setPeso(1);
		setAltura(1);
	}

	// constructor completo
	public Persona(String nombre, String apellido, int dni, String sexo, int dia, int mes, int anio, double altura,
			double peso) {

		// public Persona(String nombre, String apellido, int dni, String sexo,
		// LocalDate fecha_de_nacimiento, double altura,
		// double peso) {
		setNombre(nombre);
		setApellido(apellido);
		this.dni = (dni);
		setSexo(sexo);
		// this.fecha_de_nacimiento = LocalDate.of(2020, 01, 01);
		this.fecha_de_nacimiento = LocalDate.of(anio, mes, dia);
		setPeso(peso);
		setAltura(altura);
	}

	// constructor con dni, nombre, apellido y dni
	// probe pasarle de otra manera la fecha al LocalDate
	public Persona(String nombre, String apellido, int dni, int dia, int mes, int anio) {
		setNombre(nombre);
		setApellido(apellido);
		this.dni = (dni);
		setSexo("femenino");
		this.fecha_de_nacimiento = LocalDate.of(anio, mes, dia);
		setPeso(1);
		setAltura(1);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	// ****************
	// para determinar fecha de nacimiento - ¿esta bien?
	// ****************
	/*
	 * public void setDiaNacimiento(int dia) { this.dia = dia; }
	 * 
	 * public int getDiaNacimiento() { return dia; }
	 * 
	 * public void setMesNacimiento(int mes) { this.mes = mes; }
	 * 
	 * public int getMesNacimiento() { return mes; }
	 * 
	 * public void setAnioNacimiento(int anio) { this.anio = anio; }
	 * 
	 * public int getAnioNacimiento() { return anio; }
	 */

	// ******************************

	public LocalDate getFechaNacimiento() {
		return fecha_de_nacimiento;
	}

	/*
	 * public void setFechaNacimiento(LocalDate fecha_de_nacimiento) {
	 * this.fecha_de_nacimiento = fecha_de_nacimiento; }
	 */

	public void setFechaNacimiento(int dia, int mes, int anio) {
		this.fecha_de_nacimiento = LocalDate.of(anio, mes, dia);
	}

	public int getEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period diferencia_periodos = Period.between(fecha_de_nacimiento, fechaActual);
		edad = diferencia_periodos.getYears();
		return edad;
	}

	public void setEdad_declarada(int edad_declarada) {
		this.edad_declarada = edad_declarada;
	}

	
	public int getEdad_Declarada() {
		return edad_declarada;
	}
	
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	/*
	 * public String getFechaNacimiento() { String fechaDeNacimiento =
	 * (this.getDiaNacimiento() + "/" + this.getMesNacimiento() + "/" +
	 * this.getAnioNacimiento()); return fechaDeNacimiento; }
	 */

	/*
	 * esto está mal NUNCA usar SYSO en los metodos, a lo sumo que lo haga el
	 * usuario en el main.
	 */

	public void mostrarDatos() {
		System.out.println("Nombre y apellido: " + this.getNombre() + " " + this.getApellido());
		System.out.println("DNI: " + this.getDni());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Fecha de nacimiento: " + this.getFechaNacimiento());
		System.out.println("Edad: " + this.edad_declarada);
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("---------");
	}

	public String getDatos() {
		String datos = "Nombre y apellido: " + this.getNombre() + " " + this.getApellido() + ". " + "DNI: "
				+ this.getDni() + ". " + "Sexo: " + this.getSexo() + ". " + "Fecha de nacimiento: "
				+ this.getFechaNacimiento() + ". " + "Edad: " + this.getEdad_Declarada() + ". " + "Altura: "
				+ this.getAltura() + ". " + "Peso: " + this.getPeso();
		return datos;
	}

	/*
	 * METODOS
	 *
	 *
	 * 
	 */



	public void calcularMasaCorporal() {
		// this.masaCorporal = this.getPeso() / (this.getAltura() * this.getAltura());
		this.masaCorporal = this.getPeso() / (Math.pow(2, this.getAltura())); // dan distinto....

	}

	public double getMasaCorporal() {
		calcularMasaCorporal(); // invocarlo para poder retornarlo
		return masaCorporal;
	}

	public String isForma() {
		final double MAX_MASA = 25;
		final double MIN_MASA = 18.5;

		if ((this.getMasaCorporal() < MAX_MASA) && (this.getMasaCorporal() > MIN_MASA)) {
			return "Esta en forma";
		} else {
			return "No está en forma";
		}
	}

	public boolean isCumpleaños() {
		LocalDate fechaActual = LocalDate.now();
		if ((fechaActual.getDayOfMonth() == fecha_de_nacimiento.getDayOfMonth())
				&& (fechaActual.getMonthValue()) == fecha_de_nacimiento.getMonthValue()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isMayor() {
		return getEdad() >= 18;

	}

	public boolean puedeVotar() {
		if (getEdad() >= 16) {
			return true;
		} else {
			return false;
		}
	}

	public boolean edadCoherente() {
		return getEdad_Declarada() == getEdad();
	}

}
