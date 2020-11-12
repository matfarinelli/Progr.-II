import java.util.ArrayList;

public class Voluntario {

	private String nombre;
	private String nacionalidad;
	private int edad;
	private boolean isVaron; // genero , true varon, false mujer.
	private ArrayList<String> enfermedades;
	private boolean recibioVacuna; // true vacuna, false placebo
	private boolean contrajoEnfermedad;

	/*
	 * Constructor
	 */

	public Voluntario(String nombre, int edad, boolean isVaron, boolean recibioVacuna) {
		this.nombre = nombre;
		this.edad = edad;
		this.isVaron = isVaron;
		this.recibioVacuna = recibioVacuna;
	}

	/*
	 * Getter y setter
	 */

	public String getNombre() {
		return nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	// los implemento por que no los paso por constructor
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isVaron() {
		return isVaron;
	}

	public void addEnfermedad(String enfermedad) {
		this.enfermedades.add(enfermedad);
	}

	// si es true recibió vacuna , si el false placebo
	public boolean isRecibioVacuna() {
		return recibioVacuna;
	}

	public boolean isContrajoEnfermedad() {
		return contrajoEnfermedad;
	}

	public void setContrajoEnfermedad(boolean contrajoEnfermedad) {
		this.contrajoEnfermedad = contrajoEnfermedad;
	}

	/*
	 * Metodos específicos
	 */

	public boolean tuvoEnfermedad(String enfermedad) {
		return this.enfermedades.contains(enfermedad);
	}

}
