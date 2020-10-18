package practico_5_2;

import java.util.ArrayList;

public class Casa {

	private String nombre;
	private int limiteAlumnos;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> alumnos;

	public final int LIMITE = 100;

	/*
	// CONSTRUCTORES
	*/
	
	public Casa() {
		this.setLimiteAlumnos(LIMITE);
		alumnos = new ArrayList<Alumno>();
		cualidades = new ArrayList<String>();
	}

	public Casa(String nombre) {
		this();
		this.setNombre(nombre);
	}

	/*
	// GETTER Y SETTER
	*/
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLimiteAlumnos() {
		return limiteAlumnos;
	}

	public void setLimiteAlumnos(int limiteAlumnos) {
		this.limiteAlumnos = limiteAlumnos;
	}
	
	/*
	// METODOS
	*/
	
	public void agregarAlumno(Alumno al) {
		alumnos.add(al);
	}
	

	public boolean aceptaAlumno(Alumno al) {

	}
	
	public boolean casaLlena() {
		return this.alumnos.size() == LIMITE;
	}

	public String toString() {
		return "Nombre: " + this.getNombre() + "\nLimite Alumnos: " + this.getLimiteAlumnos();
	}

}
