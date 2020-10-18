package practico_4_4;

public class Masajista extends Persona {

	private String titulo;
	private int aniosExperiencia;

	// constructor
	public Masajista(String nombre, String apellido, int pasaporte, int dia, int mes, int anio, String estado,
			String titulo, int aniosExperiencia) {
		super(nombre, apellido, pasaporte, dia, mes, anio, estado);
		this.titulo = titulo;
		this.aniosExperiencia = aniosExperiencia;
	}

	// getter y setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String getDatos() {
		String datos = super.getDatos() + "\nTitulo: " + this.getTitulo() + "\nAños Experiencia: "
				+ this.getAniosExperiencia();
		return datos;
	}
}
